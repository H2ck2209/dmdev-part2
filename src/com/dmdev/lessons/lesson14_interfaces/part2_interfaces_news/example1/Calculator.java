package com.dmdev.lessons.lesson14_interfaces.part2_interfaces_news.example1;

public class Calculator implements AdvancedCalculate {
    @Override
    public void greeting() {
        System.out.println("Привет. Я могу складывать, вычитать и умножать числа");
    }
}
