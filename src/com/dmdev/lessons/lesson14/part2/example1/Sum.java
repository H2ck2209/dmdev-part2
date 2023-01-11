package com.dmdev.lessons.lesson14.part2.example1;

public interface Sum {
    default int sumAb(int a, int b) {
        return a + b;
    }
}
