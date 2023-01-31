package com.dmdev.lessons.lesson18_generics.examclouds.part1_parametrized_types;

public class TwoGenRunner {
    public static void main(String[] args) {
        TwoGen<Integer, String> numberName = new TwoGen<>(9, "Eric Maxime Chupo-Moting");
        numberName.showTypes();
    }
}
