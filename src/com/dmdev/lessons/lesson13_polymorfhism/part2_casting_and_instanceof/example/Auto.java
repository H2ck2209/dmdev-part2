package com.dmdev.lessons.lesson13_polymorfhism.part2_casting_and_instanceof.example;

public abstract class Auto {
    String model;
    int year;
    String color;

    public Auto(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void toColor (Auto auto, String color) {
        auto.color = color;
        System.out.println("Цвет автомобиля" + auto + " - " + color);
    }
}

