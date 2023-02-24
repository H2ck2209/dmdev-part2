package com.dmdev.lessons.lesson18_generics.part2_and_3_theory.weapon;

public class Sword implements MeleeWeapon {
    private String name = "Sword";

    @Override
    public int getDamage() {
        return 15;
    }

    @Override
    public String getName() {
        return name;
    }
}
