package org.example.DoublyLinkedList;

public class DoublyLinkedList<T> {

    private Node<T> head; // First Node
    private Node<T> tail; // Last Node
    public int size = 0;

    public void insertAtBeginning(T data) {

        Node<T> newNode = new Node<>(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
            tail.next = null;

        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }

        size++;
    }


    public void insertAtEnd(T data) {

        Node<T> newNode = new Node<>(data);

        if (tail == null) {
            head = newNode;
            tail = newNode;
            tail.previous = null;

        } else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void deleteElement(T data) {
        if (head == null) {
            return;
        }

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node<T> current = head;

            while (current != null) {

                if (current.data == data) {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
                current = current.next;
            }
        }

        size--;
    }

    public void deleteFromEnd() {

        if (tail == null) {
            return;
        }

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }
        size--;
    }

    public void deleteFromBeginning() {

        if (head == null) {
            return;
        }

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }

        size--;
    }

    public void printDataFromHead() {

        Node<T> current = head;

        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void printDataFromTail() {
        Node<T> current = tail;

        while(current != null) {
            System.out.println(current.data);
            current = current.previous;
        }
    }
}
