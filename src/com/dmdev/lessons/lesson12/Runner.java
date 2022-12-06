package com.dmdev.lessons.lesson12;

import com.dmdev.lessons.lesson11.Ram;
import com.dmdev.lessons.lesson11.Ssd;

public class Runner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(new Ssd(250), new Ram(512), 2);
        laptop.open();
        laptop.load();
    }

}
