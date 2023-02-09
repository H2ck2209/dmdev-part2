package com.examclouds.generics.practice.task3;

/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 * sum, multiply, divide, subtraction. Параметры этих методов  - два числа разного типа,
 * над которыми должна быть произведена операция.
 */
public class Calculator {

    public static <T extends Number, V extends Number> Number sum(T num1, V num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number, V extends Number> Number multiply(T num1, V num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number, V extends Number> Number divide(T num1, V num2) {
        return num1.doubleValue()/num2.doubleValue();
    }

    public static <T extends Number, V extends Number> Number subtraction(T num1, V num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
}
