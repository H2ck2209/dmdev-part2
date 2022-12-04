package com.dmdev.lessons.lesson8;

public class Computer {
    private Ram ram;
    private Ssd ssd;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void printState() {
        System.out.println("Computer: ram " + ram.getValue() + ", ssd " + ssd.getValue());
    }
}
