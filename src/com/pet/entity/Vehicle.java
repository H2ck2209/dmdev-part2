package com.pet.entity;

import com.pet.util.EnergySource;

public class Vehicle {

    private String brand;
    private EnergySource energySource;

    public Vehicle(String brand, EnergySource energySource) {
        this.brand = brand;
        this.energySource = energySource;
    }

    public String getBrand() {
        return brand;
    }

    public EnergySource getEnergySource() {
        return energySource;
    }
}
