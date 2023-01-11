package com.dmdev.lessons.lesson12.part1;

import com.dmdev.lessons.lesson11.Computer;
import com.dmdev.lessons.lesson11.Ram;
import com.dmdev.lessons.lesson11.Ssd;

public class Smartphone extends Computer {
    private double screenSize;
    private int cameraResolution;

    public Smartphone(Ssd ssd, Ram ram, double screenSize, int cameraResolution) {
        super(ssd, ram);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public void takePhoto() {
        System.out.println("Сделана фотография");
    }
}
