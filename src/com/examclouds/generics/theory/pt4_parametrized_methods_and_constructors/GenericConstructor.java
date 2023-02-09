package com.examclouds.generics.theory.pt4_parametrized_methods_and_constructors;

public class GenericConstructor {
    public double value;

    public <T extends Number> GenericConstructor(double value) {
        this.value = value;
    }

    public void showValue() {
        System.out.println("value: " + value);
    }
}
