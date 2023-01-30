package com.dmdev.lessons.lesson11_encapsulation;

public class ComputerRunner {
    public static void main(String[] args) {

        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(500);
        Computer computer = new Computer(ssd, ram);

    }
}
