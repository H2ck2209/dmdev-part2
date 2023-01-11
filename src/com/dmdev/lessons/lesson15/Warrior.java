package com.dmdev.lessons.lesson15;

import java.util.Random;

public class Warrior extends Hero {
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
