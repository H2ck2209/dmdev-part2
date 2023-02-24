package com.examclouds.generics.theory.pt1_parametrized_types;

public class TwoGen<T, V> {
    private T objectT;
    private V objectV;

    public TwoGen(T objectT, V objectV) {
        this.objectT = objectT;
        this.objectV = objectV;
    }

    public void showTypes() {
        System.out.println("Тип T: " + objectT.getClass().getName());
        System.out.println("Тип V: " + objectV.getClass().getName());
    }

    public T getObjectT() {
        return objectT;
    }

    public V getObjectV() {
        return objectV;
    }
}
