package org.example.LinkedList;

public class LinkedList {
    private Node head;
    public int size;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;

        size++;
    }


    public void deleteNode(int data) {

        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            size--;
            return;
        }

        // 10 20 30 40 50  => 10 20 30 50

        Node current = head;
        Node previous = null;

        while (current != null) {

            if (current.data == data) {
                previous.next = current.next;
                size--;
                break;
            }

            previous = current;
            current = current.next;
        }

    }


    public void printData() {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
