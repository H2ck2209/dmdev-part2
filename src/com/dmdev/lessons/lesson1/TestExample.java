package com.dmdev.lessons.lesson1;

//пример структурного программирования, когда происходит последовательное выполнение операций.
//Здесь нет оперирования объектами.

public class TestExample {
    public static void main(String[] args) {
        int value = 10;
        int[] values = {value, 100, 199, 25};
        printArray(values);
    }

    private static void printArray(int[] values) {
        for (int value : values) {
            System.out.println(value);
        }
    }
}

