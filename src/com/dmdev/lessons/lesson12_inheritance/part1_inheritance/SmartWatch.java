package com.dmdev.lessons.lesson12_inheritance.part1_inheritance;

import com.dmdev.lessons.lesson11_encapsulation.Computer;
import com.dmdev.lessons.lesson11_encapsulation.Ram;
import com.dmdev.lessons.lesson11_encapsulation.Ssd;

public class SmartWatch extends Computer{
    private double screenSize;
    private boolean waterproof;

    public SmartWatch(Ssd ssd, Ram ram, double screenSize, boolean waterproof) {
        super(ssd, ram);
        this.screenSize = screenSize;
        this.waterproof = waterproof;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public void showTime() {
        System.out.println("14:00");
    }
}
