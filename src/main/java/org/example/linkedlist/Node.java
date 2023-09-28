package org.example.linkedlist;

public class Node {
    public int value;
    public Node next;

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    Node(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Init array cannot be empty!");
        }
        this.value = arr[0];
        Node peviousNode = this;
        for (int i = 1; i < arr.length; i++) {
            Node nextNode = new Node(arr[i]);
            peviousNode.next = nextNode;
            peviousNode = nextNode;
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        Node currentNode = this;
        while (currentNode != null) {
            sb.append(currentNode.value);
            currentNode = currentNode.next;
        }

        return sb.toString();
    }
}
