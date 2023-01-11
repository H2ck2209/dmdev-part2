package com.dmdev.lessons.lesson17.example;

public enum Metals {

    IRON("Железо", 1538),
    TITAN ("Титан", 1943),
    GOLD ("Золото", 1064),
    SILVER("Серебро", 962),
    TIN("Олово", 232),
    MERCURY("Ртуть", -39),
    PLUMBUM("Свинец", 328),
    WOLFRAM("Вольфрам", 3422);

    private String name;
    private int meltingTemperature;

    public static final String[] PRECIOUS = {"Золото", "Серебро", "Платина", "Палладий"};

    Metals(String name, int meltingTemperature) {
        this.name = name;
        this.meltingTemperature = meltingTemperature;
    }


    public static void infusible() {
        System.out.println("Тугоплавкие металлы:");
        for (Metals metal : Metals.values()) {
            if (metal.getMeltingTemperature() > 1900) {
                System.out.println(metal.getName());
            }
        }
        System.out.println();
    }

    public static void isPrecious() {
        System.out.println("Драгоценные металлы:");
        for (Metals metal : Metals.values()) {
            for (int i = 0; i < PRECIOUS.length; i++) {
                if (metal.getName().equals(PRECIOUS[i])) {
                    System.out.println(metal.getName());
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getMeltingTemperature() {
        return meltingTemperature;
    }
}
