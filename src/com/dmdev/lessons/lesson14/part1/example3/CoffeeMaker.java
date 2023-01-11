package com.dmdev.lessons.lesson14.part1.example3;

public class CoffeeMaker implements ElectricityNeeded{
    @Override
    public int powerForDay() {
        return 2;
    }
}
