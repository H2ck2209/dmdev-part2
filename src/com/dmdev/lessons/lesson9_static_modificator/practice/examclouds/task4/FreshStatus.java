package com.dmdev.lessons.lesson9_static_modificator.practice.examclouds.task4;

public enum FreshStatus {
    SUPER(10),
    MIDDLE(5),
    LOW(2);

    private final int factor;

    FreshStatus(int factor) {
        this.factor = factor;
    }

    public int getFactor() {
        return this.factor;
    }
}
