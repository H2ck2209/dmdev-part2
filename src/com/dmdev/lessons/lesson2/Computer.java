package com.dmdev.lessons.lesson2;

public class Computer {
    int ssd = 550; //поле класса
    int ram = 1024;//поле класса

    void load () { // метод класса
        System.out.println("Я загрузился");
    }

    void printState () {
        System.out.println("SSD: " + ssd);
        System.out.println("SSD: " + ram);
    }
}
