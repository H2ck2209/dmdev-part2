package com.dmdev.lessons.lesson15_oop_practice;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Боромир", 50, 15);
        Hero mage = new Mage("Гендальф",50, 20);
        Hero archer = new Archer("Леголас", 50, 10);
        Enemy enemy = new Zombie("Зомби", 50, 5);
        heroAttack(enemy, warrior, mage, archer);
    }

    public static void heroAttack(Enemy enemy, Hero... heroes) {
        for (Hero hero : heroes) {
            while (enemy.isAlive()) {
                hero.attackEnemy(enemy);
            }
        }
    }
}
