package com.dmdev.lessons.lesson5;

public class Computer {
    private int ssd = 550; //поле класса
    private int ram = 0; //поле класса

    Computer(int newSsd) {
        ssd = newSsd;
        ram = 999;
        // ram = 0; // непроинициализированное поле принимает значение по умолчанию для своего типа данных
    }

    protected Computer(int ssd, int newRam) {
        // для избежания конфликта имен параметра (параметр имеет приоритет) и поля класса используется метод this
        this.ssd = ssd;
        ram = newRam;
    }

    public Computer() { // создание конструктора
        System.out.println("Я был создан");
    }


    void load() { // метод класса
        System.out.println("Я загрузился");
    }

    void printState() {
        System.out.println("SSD: " + ssd);
        System.out.println("RAM: " + ram);
        System.out.println();
    }
}
