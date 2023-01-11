package com.dmdev.lessons.lesson12.part3;

public class OldGameGadget {
    double version;

    {
        System.out.println("init block OldGameGadget");// блок инициализации
    }

    static {
        System.out.println("static init block OldGameGadget");// статический блок инициализации
    }

    public OldGameGadget(double version) {
        this.version = version;
    }

    public OldGameGadget() {
        System.out.println("Constructor OldGameGadget");
    }

    public static void launchGame1() {
        System.out.println("Game1 launched");
    }

    public void finishGame1() {
        System.out.println("Game2 finished");
    }
}
