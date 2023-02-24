package com.pet.util;

public enum EnergySource {
    PETROL("Бензин"),
    GAS("Газ"),
    DIEZEL("Дизель"),
    ELECTRICTY("Электричество");

    private final String name;

    EnergySource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
