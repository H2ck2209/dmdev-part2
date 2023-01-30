package com.dmdev.lessons.lesson7_class_composure_theory.practice.sundayPractice.task2;

public class ToyRunner {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Bunny", 3);
        ToyBox toyBox = new ToyBox(rabbit);
        System.out.println(toyBox.getToyNameAndCost());
    }
}
