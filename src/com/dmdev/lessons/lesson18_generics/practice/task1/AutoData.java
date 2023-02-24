package com.dmdev.lessons.lesson18_generics.practice.task1;

public class AutoData {
    PassengerCar[] passengerCarArray;
    FreightCar[] freightCarArray;

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
            if (passengerCarArray[i] != null) {
                System.out.println(i + 1 + ". Марка: " + passengerCarArray[i].brand + ". Тип энергоресурса: " + passengerCarArray[i].energySource.getName());
            }
        }
    }

    public void printFreightCarArray() {
        for (int i = 0; i < freightCarArray.length; i++) {
            if (freightCarArray[i] != null) {
                System.out.println(i + 1 + ". Марка: " + freightCarArray[i].brand + ". Тип энергоресурса: " + freightCarArray[i].energySource.getName());
            }
        }
    }

    public boolean passArrayIsEmpty() {
        return passengerCarArray[0] == null;
    }

    public boolean freightArrayIsEmpty() {
        return freightCarArray[0] == null;
    }

    public boolean isCorrectBrand(String brand) {
        boolean result = false;
        for (PassengerCarBrands passengerCarBrand : PassengerCarBrands.values()) {
            if (passengerCarBrand.getName().equalsIgnoreCase(brand)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public String correctBrandCase(String brand) {
        for (PassengerCarBrands passengerCarBrand : PassengerCarBrands.values()) {
            if (passengerCarBrand.getName().equalsIgnoreCase(brand)) {
                brand = passengerCarBrand.getName();
                break;
            }
        }
        return brand;
    }
}