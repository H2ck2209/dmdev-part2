package com.dmdev.lessons.lesson15_oop_practice;

public abstract class Enemy implements Mortal {
    private String name;
    private int health;
    private int damage;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    void attackHero(Hero hero) {
        hero.takeDamage(getDamage());
    }

    public void takeDamage(int damage) {
        if (isAlive()) {
            if (health <= damage) {
                health = 0;
                System.out.println(name + " погиб.");
            } else {
                health -= damage;
                System.out.println(name + " получил урон " + damage + ". Осталось " + health);
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
