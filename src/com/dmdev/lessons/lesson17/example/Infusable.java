package com.dmdev.lessons.lesson17.example;

public interface Infusable {
    default void infusible() {
        for (Metals metal : Metals.values()) {
            if (metal.getMeltingTemperature() > 1500) {
                System.out.println(metal.getName() + " относится к тугоплавким металлам");
            }
        }
    }
}
