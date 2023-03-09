package com.dmdev.lessons.lesson19_collections.part3_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArraylistRunner {
    public static void main(String[] args) {
        //ссылку Arraylist желательно заменить на List:программирование на уровне интерфейсов, а не их реализаций
        List<Integer> integers = new ArrayList<>(5);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        System.out.println(integers.get(5));
        System.out.println(integers.contains(40));
    }
}
