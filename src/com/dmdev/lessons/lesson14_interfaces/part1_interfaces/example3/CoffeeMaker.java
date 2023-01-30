package com.dmdev.lessons.lesson14_interfaces.part1_interfaces.example3;

public class CoffeeMaker implements ElectricityNeeded{
    @Override
    public int powerForDay() {
        return 2;
    }
}
