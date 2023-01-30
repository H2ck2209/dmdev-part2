package com.dmdev.lessons.lesson2_classes_and_objects;

public class ComputerRunner {
    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer(); // создание и инициализация экземпляра класса Computer
        computer.load();// вызывваем метод класса Computer
        System.out.println("RAM " + computer.ram); // обращаемся к полям класса Computer
        System.out.println("SSD " + computer.ram);// обращаемся к полям класса Computer
    }
}
