package com.dmdev.lessons.lesson16_inner_and_nested_classes;

public class BattleGround {
    public static void main(String[] args) {
        Archer archer = new Archer("Леголас", 30, 10);
        Zombie zombie = new Zombie("Зомби", 30, 10);

        // создание объекта внутреннего public класса. Ссылка Archer у переменной archer обязательна
        Archer.Hawk hawk = archer.new Hawk("Финист", 10);

        //создание объекта вложенного класса
        Archer.Bear bear = new Archer.Bear("Балу", 15);

        toFight(archer, zombie);
    }
    public static void toFight(Hero hero, Enemy enemy) {
        while (hero.isAlive()) {
            hero.attackEnemy(enemy);
            if (enemy.isAlive()) {
                enemy.attackHero(hero);
            }
        }
    }
}
