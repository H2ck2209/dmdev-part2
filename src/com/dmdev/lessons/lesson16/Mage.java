package com.dmdev.lessons.lesson16;

public class Mage extends Hero {

    public Mage(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " сотворил заклинание на " + enemy.getName());
        enemy.takeDamage(getDamage());
        System.out.println(enemy.getName() + " получил урон " + getDamage() + ". Осталось " + enemy.getHealth());
    }


}
