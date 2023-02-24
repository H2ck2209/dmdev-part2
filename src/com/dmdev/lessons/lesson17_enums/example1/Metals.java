package com.dmdev.lessons.lesson17_enums.example1;

import java.util.Arrays;

public enum Metals {

    IRON("Железо", 1538),
    TITAN("Титан", 1943),
    GOLD("Золото", 1064),
    SILVER("Серебро", 962),
    TIN("Олово", 232),
    MERCURY("Ртуть", -39),
    PLUMBUM("Свинец", 328),
    WOLFRAM("Вольфрам", 3422);

    private final String name;
    private final int meltingTemperature;

    public static final String[] PRECIOUS = {"Золото", "Серебро", "Платина", "Палладий"};

    Metals(String name, int meltingTemperature) {
        this.name = name;
        this.meltingTemperature = meltingTemperature;
    }


    public void infusible() {
        if (this.getMeltingTemperature() > 1500) {
            System.out.println(this.getName() + " относится к тугоплавким металлам");
        } else {
            System.out.println(this.getName() + " НЕ относится к тугоплавким металлам");
        }
    }

    public void isPrecious() {
            if (Arrays.toString(Metals.PRECIOUS).toLowerCase().contains(this.getName().toLowerCase())) {
                System.out.println(this.getName() + " относится к драгоценным металлам");
            } else {
                System.out.println(this.getName() + " НЕ относится к драгоценным металлам");
            }
    }

    public String getName() {
        return name;
    }

    public int getMeltingTemperature() {
        return meltingTemperature;
    }
}
// TODO: 22.01.2023 убрать static у методов, реализовать вывод результата по каждому типу. Удалить SPRINT-5 после работы с enum
