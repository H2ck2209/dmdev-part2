package com.dmdev.lessons.lesson18_generics.examclouds.part1_parametrized_types;

public class MatrixRunner {
    public static void main(String[] args) {
        String[] englishTopFour = {"Arsenal", "ManCity", "Newcastle", "ManUnited"};
        Matrix<String> stringMatrix = new Matrix<>(englishTopFour);
        Matrix<Integer> integerMatrix = new Matrix<>(new Integer[4]);
        Matrix<Byte> byteMatrix = new Matrix<>(new Byte[3]);
    }
}
