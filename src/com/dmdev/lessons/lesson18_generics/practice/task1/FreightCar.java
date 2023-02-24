package com.dmdev.lessons.lesson18_generics.practice.task1;

public class FreightCar extends Car {

    public FreightCar(String brand, EnergySource energySource) {
        super(brand, energySource);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }
}
