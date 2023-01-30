package com.dmdev.lessons.lesson14_interfaces.part1_interfaces.example1;

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
