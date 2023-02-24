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
            if (switchable instanceof Amplifier) {
                System.out.println("Усилитель " + ((Amplifier) switchable).getName() + " подключен к кабинету");
                System.out.println();
            }
        }
    }

}
