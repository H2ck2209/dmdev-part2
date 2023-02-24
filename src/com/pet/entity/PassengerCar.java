package com.pet.entity;

import com.pet.util.EnergySource;

public class PassengerCar extends Car {
    public PassengerCar(String brand, EnergySource energySource) {
        super(brand, energySource);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }
}
