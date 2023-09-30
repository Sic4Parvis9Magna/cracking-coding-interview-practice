package org.example.linkedlist;

/**
 * Implement algorithm to find the kth to last element of a singly linked list
 */
public class LinkedListTask2 {

    /**
     *
     * Solution 1: two pointers
     * O(n) in time as we walk over the list only once
     * O(1) in memory as we do not store anything
     */
    public static Node getKthTail(Node head, int k) {
        Node first = head;
        Node second = getNext(head, k);
        while (second != null) {
            first = first.next;
            second = second.next;
        }

        return first;
    }

    private static Node getNext(Node head, int k) {
        Node currentnode = head;
        for (int i = 0; i < k; i++) {
            if (currentnode == null) {
                return  null;
            }
            currentnode = currentnode.next;
        }

        return currentnode;
    }
}
