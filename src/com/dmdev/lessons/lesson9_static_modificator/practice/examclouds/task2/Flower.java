package com.dmdev.lessons.lesson9_static_modificator.practice.examclouds.task2;

/**
 * Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
 * <p>
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
 * <p>
 * Собрать 3 букета (используем массив) с определением их стоимости. В букет может входить несколько цветов разного типа.
 * <p>
 * Также подсчитать количество проданных цветов (используем статическую переменную).
 */

public class Flower {
    private String manufacturer;
    private int freshness;
    private int price;
    private static int counter;

    public Flower(String manufacturer, int freshness, int price) {
        this.manufacturer = manufacturer;
        this.freshness = freshness;
        this.price = price;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getPrice() {
        return price;
    }
}
