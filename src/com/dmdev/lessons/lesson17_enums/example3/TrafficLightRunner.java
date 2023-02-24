package com.dmdev.lessons.lesson17_enums.example3;

public class TrafficLightRunner {
    public static void main(String[] args) {
        signal(TrafficLight.YELLOW);
    }

    public static void signal(TrafficLight trafficLight) {
        switch (trafficLight) {
            case RED -> System.out.println("Движение запрещено");
            case YELLOW -> System.out.println("Внимание участникам движения");
            case GREEN -> System.out.println("Движение разрешено");
            default -> System.out.println("Светофор не работает");
        }
    }
}
