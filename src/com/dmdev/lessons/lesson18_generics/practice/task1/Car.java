package com.dmdev.lessons.lesson18_generics.practice.task1;

import com.dmdev.lessons.lesson18_generics.practice.task1.fuel.Fuel;

public class Car<T extends Fuel> extends Vehicle<T> {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }
}

