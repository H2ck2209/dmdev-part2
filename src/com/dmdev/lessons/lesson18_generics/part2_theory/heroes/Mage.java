package com.dmdev.lessons.lesson18_generics.part2_theory.heroes;

import com.dmdev.lessons.lesson15_oop_practice.Enemy;
import com.dmdev.lessons.lesson18_generics.part2_theory.weapon.MagicWeapon;

public class Mage <T extends MagicWeapon> extends Hero <T>{

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
