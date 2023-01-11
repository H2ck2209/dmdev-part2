package com.dmdev.lessons.lesson12.part2;

import com.dmdev.lessons.lesson11.Computer;
import com.dmdev.lessons.lesson11.Ram;
import com.dmdev.lessons.lesson11.Ssd;

/**
 * Laptop extends Computer extends Object
 */

public class Laptop extends Computer {
    int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    public void open() {
        System.out.println("Крышка открыта");
    }

    public void load() {
        System.out.println("Я загрузился");
    }
}
