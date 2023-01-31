package com.dmdev.lessons.lesson18_generics.examclouds.part1_parametrized_types;

public class Matrix<T> {
    private T[] array;

    public Matrix(T[] array) {
        this.array = array;
    }
}
