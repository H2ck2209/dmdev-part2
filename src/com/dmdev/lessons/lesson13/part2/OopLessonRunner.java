package com.dmdev.lessons.lesson13.part2;

import com.dmdev.lessons.lesson7.Ram;
import com.dmdev.lessons.lesson7.Ssd;

public class OopLessonRunner {
    public static void main(String[] args) {
        double avos = 2.5;
        int nebos = (int) avos;

        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));

        Laptop laptop1 = new Laptop(new Ssd(5000), new Ram(10000), 5);

        //loadComputers(laptop, mobile);
        printInformation(new Computer[]{laptop, mobile, laptop1});
    }

    public static void printInformation(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
            if (computer instanceof Laptop) {
                System.out.println("Обьект " + computer + " является Laptop");
                ((Laptop) computer).open();
            }
        }
    }

    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
        }
    }
}
