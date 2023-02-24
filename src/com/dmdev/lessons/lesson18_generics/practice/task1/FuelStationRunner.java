package com.dmdev.lessons.lesson18_generics.practice.task1;

public class FuelStationRunner {
    public static void main(String[] args) {
        FreightCar truck = new FreightCar("Iveco", EnergySource.DIEZEL);
        refuel(truck);
        PassengerCar hatchback = new PassengerCar("Opel", EnergySource.PETROL);
        refuel(hatchback);
    }


    public static void refuel(Vehicle vehicle) {
        System.out.println(vehicle.getBrand() + " fueled by " + vehicle.energySource.name());
    }
}
