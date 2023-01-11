package com.dmdev.lessons.lesson14.part1.example1;

public class Mesa extends Amplifier{
    public Mesa(int power, String name) {
        super(power, name);
    }

    @Override
    public void overdriveChannel() {
        System.out.println("Очень сильно перегруженный звук.");
    }

    @Override
    public void cleanChannel() {
        System.out.println("Немного подгруженный чистый звук.");
    }
}
