package com.dmdev.lessons.lesson14_interfaces.part2_interfaces_news;

import com.dmdev.lessons.lesson7_class_composure_theory.Ram;
import com.dmdev.lessons.lesson7_class_composure_theory.Ssd;

public class OopLessonRunner {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(125), new Ram(512));
        printWithRandom(laptop, mobile);
    }

    public static void print(Printable... objects) {
        for (Printable object : objects) {
            object.print();
            System.out.println();
        }
    }

    public static void printWithRandom(Printable... objects) {
        for (Printable object : objects) {
            object.printWithRandom();
            System.out.println();
        }
    }
}