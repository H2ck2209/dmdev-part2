package com.dmdev.lessons.lesson19_collections.part4_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Integer[] values = {1, 17, 55, 29};
        ArrayList<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, values);
        List<Integer> bytes = List.of(115, 7, 11, 17);
        System.out.println(integers);
        Iterator<Integer> intIter = integers.iterator();
        intIter.next();
        intIter.remove();
        integers.add(0, 333);
        Iterator<Integer> bytesIter = bytes.iterator();
        while (bytesIter.hasNext()) {
            Integer next = bytesIter.next();
            System.out.println(next);
        }
        while ((intIter.hasNext())) {
            Integer next = intIter.next();
            System.out.println(next);
        }
    }
}
