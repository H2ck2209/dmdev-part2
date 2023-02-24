package com.examclouds.generics.theory.pt4_parametrized_methods_and_constructors;

public class GenericConstructorDemo {
    public static void main(String[] args) {
        GenericConstructor genericConstructor = new GenericConstructor(100);
        GenericConstructor genericConstructor1 = new GenericConstructor(128.7F);

        genericConstructor.showValue();
        genericConstructor1.showValue();
    }
}