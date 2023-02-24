package com.examclouds.generics.practice.task2;

/**
 * Написать обобщенный класс MinMax, который содержит методы для нахождения
 * минимального и максимального элемента массива. Массив является переменной класса.
 * Массив должен передаваться в класс через конструктор.
 */
public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        T result = array[0];
        for (T number: array) {
            if (result.doubleValue() > number.doubleValue()) {
                result = number;
            }
        }
        return result;
    }

    public T findMax() {
        T result = array[0];
        for (T number: array) {
            if (result.doubleValue() < number.doubleValue()) {
                result = number;
            }
        }
        return result;
    }
}
