package com.dmdev.lessons.lesson12;

import com.dmdev.lessons.lesson11.Computer;
import com.dmdev.lessons.lesson11.Ram;
import com.dmdev.lessons.lesson11.Ssd;

public class Runner {
    public static void main(String[] args) {
        Laptop lenovo = new Laptop(new Ssd(250), new Ram(512), 2);
        Smartphone honor = new Smartphone(new Ssd(32), new Ram(512), 6.5, 20);
        SmartWatch samsung = new SmartWatch(new Ssd(1), new Ram(256), 1.2, true);
        TV lg = new TV(new Ssd(64), new Ram(1024), 65, true);

        Computer.resetSettings(honor);
        Computer.resetSettings(samsung);
    }
}