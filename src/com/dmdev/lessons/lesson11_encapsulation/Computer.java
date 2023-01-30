package com.dmdev.lessons.lesson11_encapsulation;

public class Computer {
    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public void load() {
        System.out.println("Я загрузился");
    }

    public static void resetSettings(Computer device) {
        System.out.println("Настройки вашего устройства "+ device +" успешно сброшены.");
    }
}
