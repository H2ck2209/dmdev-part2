package com.dmdev.lessons.lesson11.part1;

public class Computer {
    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public void load() {
        System.out.println("Я загрузился");
    }
}
