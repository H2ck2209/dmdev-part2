package com.dmdev.lessons.lesson12_inheritance.part4_abstract_classes;

public abstract class CPU {
    public abstract void launching();

    public void resetSettings() {
        System.out.println("All settings reset.");
    }
}
