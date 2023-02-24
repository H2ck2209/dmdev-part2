package com.pet;

import com.pet.util.CarBrands;

public class Test {
    public static void main(String[] args) {

    }

    public static boolean isCorrectBrand(String brand) {
        boolean result = false;
        for (CarBrands passengerCarBrand : CarBrands.values()) {
            if (passengerCarBrand.getName().equalsIgnoreCase(brand)) {
                brand = passengerCarBrand.getName();
                result = true;
                break;
            }
        }
        return result;
    }
}



