package com.dmdev.lessons.lesson14_interfaces.part2_interfaces_news.example1;

public interface AdvancedCalculate extends SimpleCalculate {
    default int multiplication (int a, int b) {
        return a * b;
    }
    void greeting ();
}
