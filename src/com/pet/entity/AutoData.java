package com.pet.entity;

import com.pet.util.CarBrands;
import com.pet.util.EnergySource;

public class AutoData {
    private PassengerCar[] passengerCarArray;
    private FreightCar[] freightCarArray;

    public AutoData() {
        this.passengerCarArray = new PassengerCar[100];
        this.freightCarArray = new FreightCar[100];

        PassengerCar kia = new PassengerCar("KIA", EnergySource.PETROL);
        PassengerCar bmw = new PassengerCar("BMW", EnergySource.DIEZEL);

        FreightCar man = new FreightCar("MAN", EnergySource.DIEZEL);

        this.passengerCarArray[0] = kia;
        this.passengerCarArray[1] = bmw;
        this.freightCarArray[0] = man;
    }

    public void addPassengerCar(PassengerCar car) {
        for (int i = 0; i < passengerCarArray.length; i++) {
            if (passengerCarArray[i] == null) {
                passengerCarArray[i] = car;
                break;
            }
        }
    }

    public void addFreightCar(FreightCar car) {
        for (int i = 0; i < freightCarArray.length; i++) {
            if (freightCarArray[i] == null) {
                freightCarArray[i] = car;
                break;
            }
        }
    }

    public void printPassCarArray() {
        for (int i = 0; i < passengerCarArray.length; i++) {
            PassengerCar car = passengerCarArray[i];

            if (car != null) {
                int orderNumber = i + 1;
                System.out.printf(
                        "%d. Марка: %s. Тип энергоресурса: %s %s",
                        orderNumber, car.getBrand(), car.getEnergySource().getName(), System.lineSeparator());
            }
        }
    }

    public void printFreightCarArray() {
        for (int i = 0; i < freightCarArray.length; i++) {
            FreightCar car = freightCarArray[i];

            if (car != null) {
                int orderNumber = i + 1;
                System.out.printf(
                        "%d. Марка: %s. Тип энергоресурса: %s %s",
                        orderNumber, car.getBrand(), car.getEnergySource().getName(), System.lineSeparator());
            }
        }
    }

    public boolean passArrayIsEmpty() {
        return passengerCarArray[0] == null;
    }

    public boolean freightArrayIsEmpty() {
        return freightCarArray[0] == null;
    }

    public String checkAndCorrectingBrand(String brand) {
        String resultBrand = null;

        if (brand != null) {
            for (CarBrands carBrand : CarBrands.values()) {
                var isContain = brand.equalsIgnoreCase(carBrand.getName());

                if (isContain) {
                    var isCorrect = brand.equals(carBrand.getName());
                    if (isCorrect) {
                        resultBrand = brand;
                    } else {
                        resultBrand = carBrand.getName();
                    }
                }
            }
        }

        return resultBrand;
    }

    public PassengerCar[] getPassengerCarArray() {
        return passengerCarArray;
    }

    public FreightCar[] getFreightCarArray() {
        return freightCarArray;
    }
}
