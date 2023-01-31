package com.dmdev.lessons.lesson18_generics.part2_theory.heroes;

import com.dmdev.lessons.lesson15_oop_practice.Enemy;
import com.dmdev.lessons.lesson18_generics.part2_theory.weapon.RangeWeapon;

public class Archer <T extends RangeWeapon> extends Hero <T> {
    // наследники параметризируются аналогично суперклассу, т.к. это параметризация на уровне класса
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


//public class Archer extends com.dmdev.lessons.lesson16_internalAndNestedClasses.Hero {
//    private com.dmdev.lessons.lesson16_internalAndNestedClasses.Archer.Wolf wolf;
//    public Archer(String name, int health, int damage, com.dmdev.lessons.lesson16_internalAndNestedClasses.Archer.Wolf wolf) {
//        super(name, health, damage);
//        this.wolf = new com.dmdev.lessons.lesson16_internalAndNestedClasses.Archer.Wolf("Вульф", 7);
//    }
//
//    @Override
//    public boolean isAlive() {
//        return getHealth() > 0;
//    }
//
//    @Override
//    void attackEnemy(Enemy enemy) {
//        System.out.println(getName() + " выстрелил из лука в " + enemy.getName());
//        wolf.attackEnemy(enemy);
//    }
//
//    private class Wolf { // внутренний класс может иметь модификатор доступа private
//        private String name;
//        private int damage;
//
//        public Wolf(String name, int damage) {
//            this.name = name;
//            this.damage = damage;
//        }
//
//        public void attackEnemy(Enemy enemy) {
//            System.out.println(name + " и " + com.dmdev.lessons.lesson16_internalAndNestedClasses.Archer.this.getName() + " наносят совместный урон");
//            enemy.takeDamage(damage + com.dmdev.lessons.lesson16_internalAndNestedClasses.Archer.this.getDamage());// обращение к внешнему классу Archer.this
//            System.out.println(enemy.getName() + " получил урон " + damage + com.dmdev.lessons.lesson16_internalAndNestedClasses.Archer.this.getDamage() + ". Осталось " + enemy.getHealth());
//        }
//    }
//}
//
