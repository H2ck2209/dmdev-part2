package com.dmdev.lessons.lesson15_oop_practice;

import java.util.Random;

public class Zombie extends Enemy {
    public Zombie(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    void attackHero(Hero hero) {
        System.out.println(getName() + " укусил " + hero.getName());
        super.attackHero(hero);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        Random random = new Random();
        if (getHealth() == 0 && random.nextBoolean()) {
            setHealth(10);
            System.out.println("Зомби воскрес!");
        }
    }
}
