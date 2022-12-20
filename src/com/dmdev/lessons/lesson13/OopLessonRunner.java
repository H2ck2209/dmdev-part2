package com.dmdev.lessons.lesson13;

import com.dmdev.lessons.lesson7.Ram;
import com.dmdev.lessons.lesson7.Ssd;

public class OopLessonRunner {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        laptop.load();
        System.out.println();
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));
        mobile.load();

        System.out.println();
        System.out.println("Выполнение метода loadComputers: ");
        System.out.println();

        loadComputers(laptop, mobile);
        printInformation(new Computer[]{laptop, mobile});
    }

    public static void printInformation(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
        }
    }

    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
        }
    }

}
