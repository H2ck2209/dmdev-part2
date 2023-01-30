 package com.dmdev.lessons.lesson13_polymorfhism.part2_casting_and_instanceof;

import com.dmdev.lessons.lesson7_class_composure_theory.Ram;
import com.dmdev.lessons.lesson7_class_composure_theory.Ssd;

public class Laptop extends Computer {
    int weight;

     public Laptop(Ssd ssd, Ram ram, int weight) {
         super(ssd, ram);
         this.weight = weight;
     }

     public void open() {
        System.out.println("Крышка открыта");
    }

     @Override
     public void load() {
         open();
         System.out.println("Я загрузился");
     }

     @Override
     public void  print() {
         super.print();
         System.out.println("Weight " + weight);
     }
 }
