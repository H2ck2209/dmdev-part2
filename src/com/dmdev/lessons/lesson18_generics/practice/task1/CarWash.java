package com.dmdev.lessons.lesson18_generics.practice.task1;

public class CarWash<T extends Car>{

    public void wash(T car) {
        System.out.println(car.getModel() + " is washed");
    }

    public void dryClean(T car) {
        System.out.println(car.getModel() + " is dry cleaned");
    }

    public<T extends FreightCar> void washTrailer(T truck) {
        System.out.println(truck.getModel() + " trailer is washed");
    }

}
