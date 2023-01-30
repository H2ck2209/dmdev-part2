package com.dmdev.lessons.lesson7_class_composure_theory.practice.sundayPractice.task1;

public class BoxRunner {
    public static void main(String[] args) {
        Box box1 = new Box(3.2, 6.7, 4.9);
        System.out.println(box1.volumeCalculate());
        System.out.println(BoxUtil.volumeCalculate(box1.getLength(), box1.getWidth(), box1.getDepth()));
    }
}
