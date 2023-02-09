package com.dmdev.lessons.lesson18_generics.practice.task1;

public class WashRunner {
    public static void main(String[] args) {
        FreightCar truck = new FreightCar("Volvo");
        PassengerCar sedan = new PassengerCar("Skoda");

        CarWash<FreightCar> truckWash = new CarWash<>();
        truckWash.wash(truck);

        CarWash<PassengerCar> carWash = new CarWash<>();
        carWash.dryClean(sedan);

        CarWash<Car> universalWash = new CarWash<>();
        universalWash.wash(sedan);
        universalWash.dryClean(truck);
        universalWash.washTrailer(truck);
//        universalWash.washTrailer(sedan); не скомпилируется из-за неверного параметра
    }
}
