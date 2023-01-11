 package com.dmdev.lessons.lesson13.part1;

import com.dmdev.lessons.lesson7.Ram;
import com.dmdev.lessons.lesson7.Ssd;

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
