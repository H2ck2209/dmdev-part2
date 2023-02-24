package com.dmdev.lessons.lesson18_generics.practice.task1;

public class Vehicle {

    String brand;
    EnergySource energySource;

    public Vehicle(String brand, EnergySource energySource) {
        this.brand = brand;
        this.energySource = energySource;
    }

    public String getBrand() {
        return brand;
    }
}
