package com.dmdev.lessons.lesson14_interfaces.part2_interfaces_news.example1;

public interface Sum {
    default int sumAb(int a, int b) {
        return a + b;
    }
}
