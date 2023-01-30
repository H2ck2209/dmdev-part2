package com.dmdev.lessons.lesson9_static_modificator.practice.examclouds.task2;

public class Florist {
    public static void main(String[] args) {
        Flower tulip = new Flower("Netherlands", 14, 80);
        Flower orchid = new Flower("China", 28, 300);
        Flower lotus = new Flower("Japan", 21, 350);

        Flower[] flavour1 = {tulip, orchid, lotus};
        Flower[] flavour2 = {tulip, tulip, tulip};
        Flower[] flavour3 = {lotus, lotus, lotus};

        int flavour1Price = totalPrice(flavour1);
        System.out.println("Цена первого букета " + flavour1Price);
        int flavour2Price = totalPrice(flavour2);
        System.out.println("Цена второго букета " + flavour2Price);
        int flavour3Price = totalPrice(flavour3);
        System.out.println("Цена третьего букета " + flavour3Price);

        System.out.println("Продано цветов " + (flavour1.length + flavour2.length + flavour3.length));
    }


    static int totalPrice(Flower[] flavour) {
        int price = 0;
        for (int i = 0; i < flavour.length; i++) {
            price += flavour[i].getPrice();
        }
        return price;
    }
}
