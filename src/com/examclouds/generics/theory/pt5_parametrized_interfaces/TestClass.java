package com.examclouds.generics.theory.pt5_parametrized_interfaces;

public class TestClass<T> implements GenericInterface<T>{

    @Override
    public T someMethod(T t) {
        return t;
    }
}
