package com.dmdev.lessons.lesson19_collections.part4_iterator;

import com.dmdev.lessons.lesson18_generics.part1_needs.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("String1");
        list.add("String2");
        list.add("String3");
        list.add("String4");


        // итерация с помощью foreach
//        for (String value : list) {
//            System.out.println(value);
//        }
        //использование уже реализованного метода forEachRemaining:
        list.iterator().forEachRemaining(System.out::println);
    }
}
