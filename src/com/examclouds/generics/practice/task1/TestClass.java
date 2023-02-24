package com.examclouds.generics.practice.task1;

public class TestClass<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T time;
    private V value;
    private K key;

    public TestClass(T time, V value, K key) {
        this.time = time;
        this.value = value;
        this.key = key;
    }

    public T getTime() {
        return time;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public void printClassNames() {
        System.out.println(getKey().getClass().getName());
        System.out.println(getTime().getClass().getName());
        System.out.println(getValue().getClass().getName());

    }
}
