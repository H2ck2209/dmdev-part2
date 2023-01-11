package com.dmdev.lessons.lesson15;

public class Archer extends Hero {
    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " выстрелил из лука в " + enemy.getName());
        enemy.takeDamage(getDamage());
        System.out.println(enemy.getName() + " получил урон " + getDamage() + ". Осталось " + enemy.getHealth());
    }
}
