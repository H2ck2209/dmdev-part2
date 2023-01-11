package com.dmdev.lessons.lesson13.part2.example;

public class ElectroCar extends Auto {

    boolean electricCar = true;

    public ElectroCar(String model, int year) {
        super(model, year);
    }

    void checkBattery() {
        System.out.println("All batteries are ready");
    }

}
