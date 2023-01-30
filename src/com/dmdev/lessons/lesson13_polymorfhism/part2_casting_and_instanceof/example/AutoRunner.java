package com.dmdev.lessons.lesson13_polymorfhism.part2_casting_and_instanceof.example;

public class AutoRunner {
    public static void main(String[] args) {
        Auto teslaT1 = new ElectroCar("Tesla", 2021);
        toChargeBattery(teslaT1);

    }

    static void toChargeBattery(Auto auto) {
        if (auto instanceof ElectroCar) {
            System.out.println("Battery charged");
        }
        ((ElectroCar) auto).checkBattery();
    }
}
