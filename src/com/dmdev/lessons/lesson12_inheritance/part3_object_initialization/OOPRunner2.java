package com.dmdev.lessons.lesson12_inheritance.part3_object_initialization;

public class OOPRunner2 {
    public static void main(String[] args) {
        //newGameGadget -> oldGameGadget -> Object
        //Object -> oldGameGadget -> newGameGadget
        new NewGameGadget();
        System.out.println();
        new OldGameGadget();

    }
}
