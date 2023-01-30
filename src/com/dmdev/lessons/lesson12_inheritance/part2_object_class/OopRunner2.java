package com.dmdev.lessons.lesson12_inheritance.part2_object_class;

import com.dmdev.lessons.lesson11_encapsulation.Ram;
import com.dmdev.lessons.lesson11_encapsulation.Ssd;

public class OopRunner2 {
    public static void main(String[] args) {
    Laptop laptop = new Laptop(new Ssd(500), new Ram(1024), 2);
    laptop.open();
    laptop.load();
        System.out.println(laptop);
    }
}
