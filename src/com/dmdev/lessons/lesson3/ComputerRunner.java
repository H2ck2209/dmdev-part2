package com.dmdev.lessons.lesson3;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer(); // создание и инициализация экземпляра класса Computer
        computer.printState();

        Computer computer2 = new Computer(1050);
        computer2.printState();

        Computer computer3 = new Computer(10000, 10000);
        computer3.printState();
    }
}