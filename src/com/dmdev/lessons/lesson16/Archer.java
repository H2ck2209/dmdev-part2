package com.dmdev.lessons.lesson16;

public class Archer extends Hero {
    private Wolf wolf;
    public Archer(String name, int health, int damage) {
        super(name, health, damage);
        this.wolf = new Wolf("Вульф", 7);
    }
    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

    @Override
    void attackEnemy(Enemy enemy) {
        class Test {// локальный класс

        }
        Test test = new Test();
        wolf.attackEnemy(enemy);
    }

    static class Bear {// вложенный класс имеет модификатор static
        private String name;
        private int damage;

        public Bear(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }
    }

    public class Hawk { // можно создавать экземпляры этого внутреннего класса
        private String name;
        private int damage;

        public Hawk(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }
    }

    private class Wolf { // нельзя создавать экземпляры внутреннего класса за пределами внешнего из-за модификаотра private
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(this + " и " + Archer.this.getName() + " наносят совместный урон");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }
}