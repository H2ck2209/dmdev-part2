package com.dmdev.lessons.lesson13_polymorfhism.part1_polymorphism;

import com.dmdev.lessons.lesson7_class_composure_theory.Ram;
import com.dmdev.lessons.lesson7_class_composure_theory.Ssd;

public class Mobile extends Computer {
    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }

    @Override
    public void load() {
        System.out.println("Я включился");
    }

}
