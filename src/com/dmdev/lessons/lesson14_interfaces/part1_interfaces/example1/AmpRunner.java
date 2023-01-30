package com.dmdev.lessons.lesson14_interfaces.part1_interfaces.example1;

public class AmpRunner {
    public static void main(String[] args) {
    Amplifier amp1 = new Mesa(25, "MiniRectifier");
    Amplifier amp2 = new Hughes(36, "Tubemeister", true);
    cabConnect(amp1, amp2);
        System.out.println("Футсвитч в наличии - " + amp1.HAS_FOOT_SWITCH);
    }

    public static void cabConnect(Switchable... amp) {
        for (Switchable switchable : amp) {
            System.out.println("Усилитель " + amp + " подключен к кабинету");
            System.out.println();
        }// TODO: 27.12.2022 можно ли заставить метод выводить имя усилителя?
    }

}
