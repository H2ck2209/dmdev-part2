package com.dmdev.lessons.lesson9.practice.examclouds.task3;

public class CircleCalculator {
    public static void main(String[] args) {
        Circle circle1 = new Circle(11);
        Circle circle2 = new Circle(50);
        System.out.println("Длина окружности радиусом 11 равна " + Circle.circleLength(11) +
                ", ее площадь " + Circle.circleSquare(11));
        System.out.println("Длина окружности радиусом 50 равна " + Circle.circleLength(50) +
                ", ее площадь " + Circle.circleSquare(50));
    }


}
