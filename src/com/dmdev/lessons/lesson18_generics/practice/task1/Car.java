package com.dmdev.lessons.lesson18_generics.practice.task1;

public class Car extends Vehicle {

    public Car(String brand, EnergySource energySource) {
        super(brand, energySource);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }
}

