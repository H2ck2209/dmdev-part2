package com.dmdev.lessons.lesson9_static_modificator.practice.examclouds.task4;

public class Flower {
    private Countries manufacturer;
    private FreshStatus freshStatus;
    private int cost;
    private int price;

    public Flower(Countries manufacturer, FreshStatus freshStatus, int cost) {
        this.manufacturer = manufacturer;
        this.freshStatus = freshStatus;
        this.cost = cost;
        this.price = cost * freshStatus.getFactor();
    }

    public Countries getManufacturer() {
        return manufacturer;
    }

    public FreshStatus getFreshStatus() {
        return freshStatus;
    }

    public int getPrice() {
        return price;
    }
}
