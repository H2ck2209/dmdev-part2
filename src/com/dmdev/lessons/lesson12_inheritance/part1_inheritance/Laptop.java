package com.dmdev.lessons.lesson12_inheritance.part1_inheritance;

import com.dmdev.lessons.lesson11_encapsulation.Computer;
import com.dmdev.lessons.lesson11_encapsulation.Ram;
import com.dmdev.lessons.lesson11_encapsulation.Ssd;

public class Laptop extends Computer {
    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    public void open() {
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
