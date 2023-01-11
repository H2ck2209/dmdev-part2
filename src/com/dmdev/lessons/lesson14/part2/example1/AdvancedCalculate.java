package com.dmdev.lessons.lesson14.part2.example1;

public interface AdvancedCalculate extends SimpleCalculate {
    default int multiplication (int a, int b) {
        return a * b;
    }
    void greeting ();
}
