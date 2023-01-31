package com.dmdev.lessons.lesson18_generics.part2_theory.heroes;

import com.dmdev.lessons.lesson15_oop_practice.Enemy;
import com.dmdev.lessons.lesson18_generics.part2_theory.weapon.MeleeWeapon;

import java.util.Random;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {
    public Warrior(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " взмахнул мечом на " + enemy.getName());
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println(getName() + " использует Мощную Атаку (урон Х2)!");
            setDamage(getDamage() * 2);
        }
        enemy.takeDamage(getDamage());
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
