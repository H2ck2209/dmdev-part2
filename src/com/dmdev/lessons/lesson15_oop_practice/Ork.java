package com.dmdev.lessons.lesson15_oop_practice;

import java.util.Random;

public class Ork extends Enemy {
    public Ork(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    void attackHero(Hero hero) {
        System.out.println(getName() + " ударил кинжалом " + hero.getName());
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println(getName() + " использовал отравленный клинок (урон +5!)");
            setDamage(getDamage() + 5);
        }
        super.attackHero(hero);
    }
}
