package org.example.DoublyLinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    DoublyLinkedList<Integer> linkedList;
    Random random;

    @BeforeEach
    void setUp() {
        linkedList = new DoublyLinkedList<>();
        random = new Random();
    }

    @Test
    void insertAtBeginning() {
        IntStream nums = random.ints(5, 1, 100);

        nums.forEach(n -> {
            linkedList.insertAtBeginning(n);
        });

        System.out.println("Printing From Head");
        linkedList.printDataFromHead();

        System.out.println("Printing From Tail");
        linkedList.printDataFromTail();

        assertEquals(5, linkedList.size);
    }

    @Test
    void insertAtEnd() {
        IntStream nums = random.ints(5, 1, 100);

        nums.forEach(n -> {
            linkedList.insertAtEnd(n);
        });

        System.out.println("Printing From Head");
        linkedList.printDataFromHead();

        System.out.println("Printing From Tail");
        linkedList.printDataFromTail();

        assertEquals(5, linkedList.size);
    }

    @Test
    void deleteElement() {
        int[] nums = random.ints(5, 1, 100).toArray();

        for (int num : nums) {
            linkedList.insertAtEnd(num);
        }

        linkedList.deleteElement(nums[3]);

        assertEquals(4, linkedList.size);
    }

    @Test
    void deleteFromEnd() {
        IntStream nums = random.ints(5, 1, 100);

        nums.forEach(n -> {
            linkedList.insertAtEnd(n);
        });

        linkedList.deleteFromEnd();

        assertEquals(4, linkedList.size);
    }

    @Test
    void deleteFromBeginning() {
        IntStream nums = random.ints(5, 1, 100);

        nums.forEach(n -> {
            linkedList.insertAtEnd(n);
        });

        linkedList.deleteFromBeginning();

        assertEquals(4, linkedList.size);
    }
}