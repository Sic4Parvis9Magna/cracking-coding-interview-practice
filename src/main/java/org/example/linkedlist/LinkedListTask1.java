package org.example.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Write code to remove duplicates from an unsorted linked list
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class LinkedListTask1 {
    /**
     *
     * Solution 1:
     * O(n) in time as we walk over the list only once
     * O(n) in memory we store the whole list in the worst case
     */
    public static Node deduplicate(Node head) {
        Set<Integer> items = new HashSet<>();
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode!=null) {
            if (items.contains(currentNode.value)) {
                previousNode.next = currentNode.next;
            } else {
                items.add(currentNode.value);
                previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }

        return head;
    }
}
