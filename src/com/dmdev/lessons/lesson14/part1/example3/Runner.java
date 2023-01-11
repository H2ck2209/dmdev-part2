package com.dmdev.lessons.lesson14.part1.example3;

public class Runner {
    public static void main(String[] args) {
        Refrigerator homeRefrigerator = new Refrigerator();
        CoffeeMaker homeCoffeeMaker = new CoffeeMaker();
        System.out.println(energySum(homeRefrigerator,homeCoffeeMaker));
    }

    static int energySum (ElectricityNeeded... devices) {
        int result = 0;
        for (ElectricityNeeded device : devices) {
            result += device.powerForDay();
        }
        return result;
    }

}
