package com.examclouds.generics.theory.pt2_and_3_bounded_types_and_wildcards;

public class AverageRunner {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Average<Integer> integerObject = new Average<>(intArray);
        System.out.println("среднее значение для массива Integer: " + integerObject.average());

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Average<Double> doubleObject = new Average<>(doubleArray);
        System.out.println("среднее значение для массива Double: " + doubleObject.average());

//        String[] stringArray = {"His", "Name", "Is", "Robert", "Paulsen"};
//        // не получится высчитать среднее значение для массива String, т.к. String не является наследником
//        //Numbers

        Float[] floatArray = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Average<Float> floatObject = new Average<>(floatArray);
        System.out.println("Среднее значения для Float " + floatObject.average());

        if (integerObject.sameAvg(doubleObject)) {
            System.out.println("Same");
        } else {
            System.out.println("differ");
        }

        System.out.print("Средние значения для integerObject и doubleObject: R");
        if (integerObject.sameAvg(doubleObject)) {
            System.out.println("одинаковые.");
        } else {
            System.out.println("разные.");
        }

        System.out.print("Средние значения для integerObject и floatObject: ");
        if (integerObject.sameAvg(floatObject)) {
            System.out.println("одинаковые.");
        } else {
            System.out.println("разные.");
        }
    }
}
