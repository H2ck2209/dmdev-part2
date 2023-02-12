package com.dmdev.lessons.lesson18_generics.practice.task1;

import com.dmdev.lessons.lesson18_generics.practice.task1.fuel.Diezel;
import com.dmdev.lessons.lesson18_generics.practice.task1.fuel.Fuel;

public class FuelStationRunner {
    public static void main(String[] args) {
        FreightCar<Diezel> truck = new FreightCar<>("Iveco");
        refuel(truck);
    }


    public static void refuel(Vehicle<? extends Fuel> vehicle) {
        System.out.println(vehicle.getBrand() +  " was refueled");
    }
}
