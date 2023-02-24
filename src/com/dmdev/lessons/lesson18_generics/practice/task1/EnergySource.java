package com.dmdev.lessons.lesson18_generics.practice.task1;

public enum EnergySource {
    PETROL("Бензин"),
    GAS("Газ"),
    DIEZEL("Дизель"),
    ELECTRICTY("Электричество");

    private String name;

    EnergySource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
