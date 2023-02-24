package com.dmdev.lessons.lesson18_generics.practice.task1;

public class PassengerCar extends Car {
    public PassengerCar(String brand, EnergySource energySource) {
        super(brand, energySource);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }
}
