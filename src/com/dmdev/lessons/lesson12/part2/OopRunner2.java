package com.dmdev.lessons.lesson12.part2;

import com.dmdev.lessons.lesson11.Ram;
import com.dmdev.lessons.lesson11.Ssd;

public class OopRunner2 {
    public static void main(String[] args) {
    Laptop laptop = new Laptop(new Ssd(500), new Ram(1024), 2);
    laptop.open();
    laptop.load();
        System.out.println(laptop);
    }
}
