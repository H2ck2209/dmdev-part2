package com.dmdev.lessons.lesson18_generics.practice.task1;

import com.dmdev.lessons.lesson18_generics.practice.task1.fuel.Fuel;

public class Vehicle<T extends Fuel> {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
