package com.dmdev.lessons.lesson9_static_modificator.practice.examclouds.task3;

/**
 * 4. Класс Circle
 * <p>
 * Создать класс Circle, который содержит
 * - переменную radius;
 * - методы, вычисляющие площадь и длину окружности;
 * - константу PI.
 * Создать несколько объектов данного класса.
 */

public class Circle {
    private int radius;
    private static final double PI = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    static double circleLength(int radius) {
        return 2 * PI * radius;
    }

    static double circleSquare(int radius) {
        return PI * radius * radius;
    }
}
