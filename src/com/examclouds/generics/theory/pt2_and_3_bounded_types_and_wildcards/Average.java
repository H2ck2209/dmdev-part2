package com.examclouds.generics.theory.pt2_and_3_bounded_types_and_wildcards;

public class Average<T extends Number> {//ограничиваем параметризацию наследниками класса Number
    private T[] array;

    public Average(T[] array) {
        this.array = array;
    }
    public double average() {
        double sum = 0.0;
        for (T value: array) {
            sum += value.doubleValue();
        }
        return sum/array.length;
    }
    boolean sameAvg(Average<?> object) {
        return average() == object.average();
    }
}
