package com.dmdev.lessons.lesson14_interfaces.part2_interfaces_news.example1;

public interface SimpleCalculate extends Sum{
    default int difAb(int a, int b) {
        return a - b;
    }
}
