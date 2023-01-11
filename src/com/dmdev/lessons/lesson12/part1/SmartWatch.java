package com.dmdev.lessons.lesson12.part1;

import com.dmdev.lessons.lesson11.Computer;
import com.dmdev.lessons.lesson11.Ram;
import com.dmdev.lessons.lesson11.Ssd;

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
