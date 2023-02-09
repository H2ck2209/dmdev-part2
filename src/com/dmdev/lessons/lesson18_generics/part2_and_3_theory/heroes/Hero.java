package com.dmdev.lessons.lesson18_generics.part2_and_3_theory.heroes;

import com.dmdev.lessons.lesson15_oop_practice.Enemy;
import com.dmdev.lessons.lesson15_oop_practice.Mortal;

public abstract class Hero<T> implements Mortal {// параметризация на уровне класса
    private String name;
    private int health;
    private int damage;
    private T weapon;

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        if (isAlive()) {
            if (health <= damage) {
                health = 0;
                System.out.println(name + " погиб.");
            } else {
                health -= damage;
//                System.out.println(name + " получил урон " + damage + ". Осталось " + health);
                String result = "%s получил урон %d. Осталось %d".formatted(name, damage, health);
                System.out.println(result);
            }
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
