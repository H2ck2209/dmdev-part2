package com.dmdev.lessons.lesson14.part2;

import java.util.Random;

public interface Printable {
    String SOME_VALUE = "Example";
    Random RANDOM = new Random();

    default void printWithRandom() {
        System.out.println(generateRandom());
        print();
    }

    static int generateRandom() {
        return (RANDOM.nextInt());
    }

    void print();
}
