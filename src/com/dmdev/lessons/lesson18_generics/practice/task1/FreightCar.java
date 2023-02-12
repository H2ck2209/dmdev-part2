package com.dmdev.lessons.lesson18_generics.practice.task1;

import com.dmdev.lessons.lesson18_generics.practice.task1.fuel.Fuel;

public class FreightCar<T extends Fuel> extends Car<T> {

    public FreightCar(String brand) {
        super(brand);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }
}