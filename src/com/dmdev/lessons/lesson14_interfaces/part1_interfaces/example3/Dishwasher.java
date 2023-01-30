package com.dmdev.lessons.lesson14_interfaces.part1_interfaces.example3;

public class Dishwasher implements ElectricityNeeded{
    @Override
    public int powerForDay() {
        return 3;
    }
}
