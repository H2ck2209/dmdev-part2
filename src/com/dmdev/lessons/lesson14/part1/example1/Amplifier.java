package com.dmdev.lessons.lesson14.part1.example1;

public abstract class Amplifier implements Switchable {

    private int power;
    private String name;

    public Amplifier(int power, String name) {
        this.power = power;
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public void activate() {
        System.out.println("Amp is ready");
    }
}
