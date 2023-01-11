package com.dmdev.lessons.lesson14.part1.example3;

public class Dishwasher implements ElectricityNeeded{
    @Override
    public int powerForDay() {
        return 3;
    }
}
