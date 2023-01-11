package com.dmdev.lessons.lesson12.part3;

public class NewGameGadget extends OldGameGadget {

    {
        System.out.println("init block NewGameGadget"); // блок инициализации
    }

    static {
        System.out.println("static init block NewGameGadget"); // статический блок инициализации
    }

    public NewGameGadget() {
        System.out.println("Constructor NewGameGadget");
    }
}
