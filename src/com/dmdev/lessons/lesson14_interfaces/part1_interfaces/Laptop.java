 package com.dmdev.lessons.lesson14_interfaces.part1_interfaces;

import com.dmdev.lessons.lesson7_class_composure_theory.Ram;
import com.dmdev.lessons.lesson7_class_composure_theory.Ssd;

 /**
 * Laptop extends Computer extends Object
 */
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
