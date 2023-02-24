package com.dmdev.lessons.lesson18_generics.part2_and_3_theory;

import com.dmdev.lessons.lesson18_generics.part2_and_3_theory.heroes.Archer;
import com.dmdev.lessons.lesson18_generics.part2_and_3_theory.heroes.Hero;
import com.dmdev.lessons.lesson18_generics.part2_and_3_theory.heroes.Warrior;
import com.dmdev.lessons.lesson18_generics.part2_and_3_theory.weapon.Bow;
import com.dmdev.lessons.lesson18_generics.part2_and_3_theory.weapon.Sword;
import com.dmdev.lessons.lesson18_generics.part2_and_3_theory.weapon.Weapon;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Леголас", 50, 15);
        archer.setWeapon(new Bow());
        Warrior<Sword> warrior = new Warrior<>("Боромир", 50, 20);
        warrior.setWeapon(new Sword());
        printWeapon(archer);
        printWeaponDamage(warrior);
        // TODO: 03.02.2023 Consumers and Producers????
    }

    public static <T extends Weapon> void printWeapon(Hero<T> hero) {// параметризация на уровне метода через TYPE
        System.out.println(hero.getWeapon().getName());
    }

    public static void printWeaponDamage(Hero<? extends Weapon> hero) {// параметризация на уровне метода через Wildcard (он же метасимвол)
        System.out.println(hero.getWeapon().getDamage());
    }
}
