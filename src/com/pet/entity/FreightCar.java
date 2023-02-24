package com.pet.entity;

import com.pet.util.EnergySource;

public class FreightCar extends Car {

    public FreightCar(String brand, EnergySource energySource) {
        super(brand, energySource);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }
}
