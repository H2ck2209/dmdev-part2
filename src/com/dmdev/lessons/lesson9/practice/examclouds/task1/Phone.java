package com.dmdev.lessons.lesson9.practice.examclouds.task1;

/**
 * 1. Подсчет количества телефонов
 * <p>
 * Реализовать подсчет количества созданных телефонов с помощью статической переменной.
 */

public class Phone {
    private String model;
    private int year;
    private static int counter;

    public Phone(String model, int year) {
        this.model = model;
        this.year = year;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
