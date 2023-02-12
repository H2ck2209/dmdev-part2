package com.dmdev.lessons.lesson18_generics.practice.task1.fuel;

public abstract class Diezel implements Fuel{
    public static final String name = "Diezel";
    private double price;
    public static final boolean isEco = false;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
