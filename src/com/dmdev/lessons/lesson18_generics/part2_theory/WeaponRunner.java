package com.dmdev.lessons.lesson18_generics.part2_theory;

import com.dmdev.lessons.lesson18_generics.part2_theory.heroes.Archer;
import com.dmdev.lessons.lesson18_generics.part2_theory.heroes.Warrior;
import com.dmdev.lessons.lesson18_generics.part2_theory.weapon.Bow;
import com.dmdev.lessons.lesson18_generics.part2_theory.weapon.Sword;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Леголас", 50, 15);
         archer.setWeapon(new Bow());
        Warrior<Sword> warrior = new Warrior<>("Боромир", 50, 20);
        warrior.setWeapon(new Sword());
    }
}
