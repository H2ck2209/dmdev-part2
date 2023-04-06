package com.dmdev.lessons.lesson19_collections.part4_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> sourceList = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list = new ArrayList<>(sourceList);
        // итерация с помощью цикла for
//        for (int i = 0; i < list.size(); i++) {
//            Integer integer = list.get(i);
//        }
        // итерация с помощью цикла foreach (метод remove на сработает, т.к. foreach только для чтения)
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }

        // использование итератора в цикле for

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            if (next == 3 || next == 4) {
                iterator.remove();// в метод ничего не передается, так как next определяет движение "курсора" итератора
            }
        }
        System.out.println(list);

        // использование итератора в цикле while
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            System.out.println(next);
//       }
    }
}
