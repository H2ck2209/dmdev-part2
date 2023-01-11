package com.dmdev.lessons.lesson14.part2.example1;

public interface SimpleCalculate extends Sum{
    default int difAb(int a, int b) {
        return a - b;
    }
}
