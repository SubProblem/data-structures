package org.example.LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LinkedListTest {

    LinkedList list;
    Random random;

    @BeforeEach
    void init() {
        list = new LinkedList();
        random = new Random();

    }

    @Test
    void insertAtEnd() {
        IntStream nums = random.ints(5, 1, 100);

        nums.forEach(n -> {
            list.insertAtEnd(n);
        });

        list.printData();

        assertEquals(5, list.size);
    }

    @Test
    void insertAtBeginning() {
        IntStream nums = random.ints(5, 1, 100);

        nums.forEach(n -> {
            list.insertAtBeginning(n);
        });

        list.printData();

        assertEquals(5, list.size);
    }


    @Test
    void deleteNode() {

        int[] array = new int[] {1, 2, 3, 4, 5};

        Arrays.stream(array).forEach(n -> list.insertAtEnd(n));

        list.deleteNode(3);

        list.printData();

        assertEquals(4, list.size);
    }

}