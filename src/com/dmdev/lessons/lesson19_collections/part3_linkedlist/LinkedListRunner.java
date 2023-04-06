package com.dmdev.lessons.lesson19_collections.part3_linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListRunner {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        integers.add(0, 432);
        integers.add(1, 400);
        integers.add(0, 113);
        integers.add(3,256);
        integers.add(16);
        integers.remove(2);
        System.out.println(integers);
    }
}
