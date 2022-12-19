package com.dmdev.lessons.lesson12.part3;

public class OOPRunner2 {
    public static void main(String[] args) {
        //newGameGadget -> oldGameGadget -> Object
        //Object -> oldGameGadget -> newGameGadget
        new NewGameGadget();
        System.out.println();
        new OldGameGadget();

    }
}
