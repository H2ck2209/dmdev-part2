package com.dmdev.lessons.lesson18_generics.practice.task1;

public enum EnergySource {
    PETROL(false),

    GAS(true),
    DIEZEL(true),
    ELECTRICTY(true);
    private boolean isEco;

    EnergySource(boolean isEco) {
        this.isEco = isEco;
    }

    public boolean isEco() {
        return isEco;
    }
}
