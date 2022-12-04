package com.dmdev.lessons.lesson7.practice.sundayPractice.task2;

public class ToyBox {
    private Bear bear;
    private Rabbit rabbit;
    private Tiger tiger;

    public ToyBox(Bear bear) {
        this.bear = bear;
    }

    public ToyBox(Rabbit rabbit) {
        this.rabbit = rabbit;
    }

    public ToyBox(Tiger tiger) {
        this.tiger = tiger;
    }

    public String getToyNameAndCost() {
        if (bear != null) {
            return bear.getName() + " " + bear.getCost();
        } else if (tiger != null) {
            return tiger.getName() + " " + tiger.getCost();
        } else if (rabbit != null) {
            return rabbit.getName() + " " + rabbit.getCost();
        } else {
            return "Toy box is empty";
        }
    }
}
