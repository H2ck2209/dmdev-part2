package com.dmdev.lessons.lesson7.practice.sundayPractice.task1;

public class Box {
    private double length;
    private double width;
    private double depth;

    public Box(double length, double width, double depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    public double volumeCalculate() {
        return length * width * depth;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }
}
