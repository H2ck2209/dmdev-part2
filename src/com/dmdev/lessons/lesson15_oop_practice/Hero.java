package com.dmdev.lessons.lesson15_oop_practice;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private int damage;

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
}
