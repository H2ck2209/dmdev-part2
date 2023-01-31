package com.dmdev.lessons.lesson18_generics.examclouds.part2_bounded_types;

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
