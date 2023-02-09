package com.examclouds.generics.theory.pt1_parametrized_types;

public class TwoGenRunner {
    public static void main(String[] args) {
        TwoGen<Integer, String> numberName = new TwoGen<>(9, "Eric Maxime Chupo-Moting");
        numberName.showTypes();
    }
}
