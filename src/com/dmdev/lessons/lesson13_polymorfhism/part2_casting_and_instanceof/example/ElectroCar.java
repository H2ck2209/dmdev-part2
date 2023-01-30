package com.dmdev.lessons.lesson13_polymorfhism.part2_casting_and_instanceof.example;

public class ElectroCar extends Auto {

    boolean electricCar = true;

    public ElectroCar(String model, int year) {
        super(model, year);
    }

    void checkBattery() {
        System.out.println("All batteries are ready");
    }

}
