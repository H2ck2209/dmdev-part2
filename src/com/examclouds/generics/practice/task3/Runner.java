package com.examclouds.generics.practice.task3;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(89,10.12));
        float result = Calculator.multiply(9, 67.1F).floatValue();
        System.out.println(result);
        System.out.println(Calculator.divide(39,13));
        System.out.println(Calculator.subtraction(99,97));
    }
}
