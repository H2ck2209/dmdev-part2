package com.dmdev.lessons.lesson17_enums.example3;

public enum TrafficLight {
    RED(30), YELLOW(3), GREEN(40);

    int time;

    TrafficLight(int time) {
        this.time = time;
    }
}
