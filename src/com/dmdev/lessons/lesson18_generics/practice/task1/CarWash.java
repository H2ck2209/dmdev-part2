package com.dmdev.lessons.lesson18_generics.practice.task1;

public class CarWash<T extends Vehicle>{

    public void wash(T car) {
        System.out.println(car.getBrand() + " is washed");
    }

    public <V extends FreightCar> void washTrailer(V truck) {
        System.out.println(truck.getBrand() + " trailer is washed");
    }
}
