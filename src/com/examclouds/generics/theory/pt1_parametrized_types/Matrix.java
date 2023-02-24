package com.examclouds.generics.theory.pt1_parametrized_types;

public class Matrix<T> {
    private T[] array;

    public Matrix(T[] array) {
        this.array = array;
    }
}
