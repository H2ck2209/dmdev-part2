package com.dmdev.lessons.lesson18_generics.practice.task1;

public class CarWash {
    PassengerCar[] passBoxes = new PassengerCar[3];
    FreightCar[] freightBoxes = new FreightCar[1];

    // Private модификаторы для полей плюс конструктор во всех классах.

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

}
