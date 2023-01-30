package com.dmdev.lessons.lesson15_oop_practice;

public class BattleGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Боромир", 50, 15);
        Enemy zombie = new Zombie("Зомби", 20, 5);
        Enemy ork = new Ork("Орк", 60, 10);
        toFightAll(warrior, zombie, ork);
    }

    public static void toFight(Hero hero, Enemy enemy) {
        while (hero.isAlive() && enemy.isAlive()) {
            hero.attackEnemy(enemy);
            if (enemy.isAlive())
                enemy.attackHero(hero);
        }
    }

    public static void toFightAll(Hero hero, Enemy... enemies) {
        while (hero.isAlive())
            for (Enemy enemy : enemies) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                    if (enemy.isAlive()) {
                        enemy.attackHero(hero);
                    }
                }
            }
    }
}
