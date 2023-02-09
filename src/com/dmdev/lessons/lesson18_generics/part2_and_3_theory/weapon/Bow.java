package com.dmdev.lessons.lesson18_generics.part2_and_3_theory.weapon;

public class Bow implements RangeWeapon {
    private String name = "Bow";

    @Override
    public int getDamage() {
        return 10;
    }

    @Override
    public String getName() {
        return name;
    }
}


