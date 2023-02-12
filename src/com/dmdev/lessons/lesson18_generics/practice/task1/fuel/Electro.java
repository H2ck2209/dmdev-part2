package com.dmdev.lessons.lesson18_generics.practice.task1.fuel;

public class Electro implements Fuel {
    public static final String name = "Electricity";
    private double price;
    public static final boolean isEco = true;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
