package com.dmdev.lessons.lesson18_generics.practice.task1;

public class Test {
    public static void main(String[] args) {

        String testBrand = "Range Rover";
        if(isCorrectBrand(testBrand)) {
            System.out.println("Марка совпадает");
        }else {
            System.out.println("такой марки нет");
        }
    }

    public static boolean isCorrectBrand(String brand) {
        boolean result = false;
        for (PassengerCarBrands passengerCarBrand : PassengerCarBrands.values()) {
            if (passengerCarBrand.getName().equalsIgnoreCase(brand)) {
                brand = passengerCarBrand.getName();
                result = true;
                break;
            }
        }
        return result;
    }
}



