package com.dmdev.lessons.lesson14_interfaces.part1_interfaces.example1;

public class Vox extends Amplifier{
    public Vox(int power, String name) {
        super(power, name);
    }

    @Override
    public void overdriveChannel() {
        System.out.println("нет перегруженного звука");
    }

    @Override
    public void cleanChannel() {
        System.out.println("Эталон чистого звука");
    }
}
