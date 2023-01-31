package com.dmdev.lessons.lesson18_generics.examclouds.part2_bounded_types;

public class AverageRunner {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Average<Integer> integerAverage = new Average<>(intArray);
        System.out.println("среднее значение для массива Integer: " + integerAverage.average());

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Average<Double> doubleAverage = new Average<>(doubleArray);
        System.out.println("среднее значение для массива Double: " + doubleAverage.average());

        String[] stringArray = {"His", "Name", "Is", "Robert", "Paulson"};
        // не получится высчитать среднее значение для массива String, т.к. String не является наследником
        //Numbers
        if (integerAverage.sameAvg(doubleAverage)) {
            System.out.println("Same");
        } else {
            System.out.println("differ");
        }
    }
}
