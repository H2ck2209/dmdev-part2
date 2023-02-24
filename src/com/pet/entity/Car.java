package com.pet.entity;

import com.pet.util.EnergySource;

public class Car extends Vehicle {

    public Car(String brand, EnergySource energySource) {
        super(brand, energySource);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }
}
