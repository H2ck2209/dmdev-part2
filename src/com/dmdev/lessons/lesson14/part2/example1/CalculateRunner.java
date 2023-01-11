package com.dmdev.lessons.lesson14.part2.example1;

public class CalculateRunner {
    public static void main(String[] args) {
        AdvancedCalculate calculator1 = new Calculator();
        int a = 17;
        int b = 13;
        System.out.println(calculator1.multiplication(a, b));
        SimpleCalculate calculator2 = new Calculator();
        printDifference(a, b, calculator1, calculator2);
    }
    public static void printDifference(int a, int b, SimpleCalculate... calculators) {
        for (SimpleCalculate calculator : calculators) {
            System.out.println(calculator.difAb(a, b));
        }
    }
}
