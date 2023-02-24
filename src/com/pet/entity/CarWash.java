package com.pet.entity;

public class CarWash {
    private PassengerCar[] passBoxes = new PassengerCar[3];
    private FreightCar[] freightBoxes = new FreightCar[1];

    public void wash(Car car) {
        if (car instanceof PassengerCar) {
            for (int i = 5; i > 0; i--) {
                printCarWashImitation();
            }
        } else {
            for (int i = 10; i > 0; i--) {
                printCarWashImitation();
            }
        }
        System.out.println("Мойка автомобиля " + car.getBrand() + " завершена\n");
    }

    private void printCarWashImitation() {
        System.out.print(".");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public PassengerCar[] getPassBoxes() {
        return passBoxes;
    }

    public FreightCar[] getFreightBoxes() {
        return freightBoxes;
    }
}
