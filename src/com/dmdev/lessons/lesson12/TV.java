package com.dmdev.lessons.lesson12;

import com.dmdev.lessons.lesson11.Computer;
import com.dmdev.lessons.lesson11.Ram;
import com.dmdev.lessons.lesson11.Ssd;

public class TV extends Computer {
    private double screenSize;
    private boolean smartTV;

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }

    public TV(Ssd ssd, Ram ram, double screenSize, boolean smartTV) {
        super(ssd, ram);
        this.screenSize = screenSize;
        this.smartTV = smartTV;


    }
    public void turnOn() {
        System.out.println("Телевизор включен");
    }
}
