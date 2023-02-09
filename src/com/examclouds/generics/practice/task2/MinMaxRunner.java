package com.examclouds.generics.practice.task2;

public class MinMaxRunner {
    public static void main(String[] args) {
        Number[] array = {10.3F, 17.88, 34 ,99L, 8};
        MinMax<?> minMax = new MinMax<>(array);
        System.out.println(minMax.findMin());
        System.out.println(minMax.findMax());
    }
}
