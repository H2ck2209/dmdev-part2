package com.dmdev.lessons.lesson14.part1.example1;

public class Hughes extends Amplifier {
    boolean hasFx;

    public Hughes(int power, String name, boolean hasFx) {
        super(power, name);
        this.hasFx = hasFx;
    }

    @Override
    public void overdriveChannel() {
        System.out.println("Перегруженный звук. Преобладают верхние и средние частоты");
    }

    @Override
    public void cleanChannel() {
        System.out.println("Яркий чистый звук");
    }
}
