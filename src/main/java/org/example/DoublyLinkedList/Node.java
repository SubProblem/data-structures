package org.example.DoublyLinkedList;

public class Node<T> {

    public T data;
    Node<T> previous;
    Node<T> next;

    public Node() {
    }

    public Node(T data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}
