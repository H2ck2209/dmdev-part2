package com.dmdev.lessons.lesson18_generics.part2_and_3_theory.weapon;

public class Wand implements MagicWeapon {
    private String name = "Wand";

    @Override
    public int getDamage() {
        return 20;
    }

    @Override
    public String getName() {
        return name;
    }

}
