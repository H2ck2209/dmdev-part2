package com.dmdev.lessons.lesson14_interfaces.part1_interfaces.example3;

public class Refrigerator implements ElectricityNeeded, DeepFrostable{
    @Override
    public void deepFrost() {
        System.out.println("Технология активна");
    }

    @Override
    public int powerForDay() {
        return 10;
    }
}
