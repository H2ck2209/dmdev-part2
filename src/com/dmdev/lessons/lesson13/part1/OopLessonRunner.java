package com.dmdev.lessons.lesson13.part1;

import com.dmdev.lessons.lesson7.Ram;
import com.dmdev.lessons.lesson7.Ssd;

public class OopLessonRunner {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));

        loadComputers(laptop, mobile);
        printInformation(new Computer[]{laptop, mobile});
    }

    public static void printInformation(Computer[] computers) {
        for (Computer computer : computers) {
            if (computer instanceof Laptop)
            computer.print();
        }
    }

    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
        }
    }

}
