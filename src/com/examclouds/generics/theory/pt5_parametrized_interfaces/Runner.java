package com.examclouds.generics.theory.pt5_parametrized_interfaces;

public class Runner {
    public static void main(String[] args) {
        GenericInterface<Integer> object = new TestClass<>();
        System.out.println(object.someMethod(3));
    }
}
