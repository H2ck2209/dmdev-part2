package com.dmdev.lessons.lesson14.part2;

import com.dmdev.lessons.lesson7.Ram;
import com.dmdev.lessons.lesson7.Ssd;

public class Mobile extends Computer {
    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }

    @Override
    public void load() {
        System.out.println("Я включился");
    }

}
