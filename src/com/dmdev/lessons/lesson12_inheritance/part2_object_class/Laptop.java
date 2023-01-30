package com.dmdev.lessons.lesson12_inheritance.part2_object_class;

import com.dmdev.lessons.lesson11_encapsulation.Computer;
import com.dmdev.lessons.lesson11_encapsulation.Ram;
import com.dmdev.lessons.lesson11_encapsulation.Ssd;

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
