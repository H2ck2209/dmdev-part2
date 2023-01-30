package com.dmdev.lessons.lesson14_interfaces.part1_interfaces;

import com.dmdev.lessons.lesson7_class_composure_theory.Ram;
import com.dmdev.lessons.lesson7_class_composure_theory.Ssd;

public abstract class Computer implements Printable{
    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }
     @Override
    public void print() {
        System.out.println("SSD " + ssd.getValue() +", ram: " + ram.getValue());
    }

    public abstract void load();

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
