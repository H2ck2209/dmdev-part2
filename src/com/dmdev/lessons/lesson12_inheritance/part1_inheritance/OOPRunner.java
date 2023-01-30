package com.dmdev.lessons.lesson12_inheritance.part1_inheritance;

import com.dmdev.lessons.lesson11_encapsulation.Computer;
import com.dmdev.lessons.lesson11_encapsulation.Ram;
import com.dmdev.lessons.lesson11_encapsulation.Ssd;
import com.dmdev.lessons.lesson12_inheritance.part3_object_initialization.NewGameGadget;
import com.dmdev.lessons.lesson12_inheritance.part3_object_initialization.OldGameGadget;

public class OOPRunner {
    public static void main(String[] args) {
        Laptop lenovo = new Laptop(new Ssd(250), new Ram(512), 2);
        Smartphone honor = new Smartphone(new Ssd(32), new Ram(512), 6.5, 20);
        SmartWatch samsung = new SmartWatch(new Ssd(1), new Ram(256), 1.2, true);
        TV lg = new TV(new Ssd(64), new Ram(1024), 65, true);

        Computer.resetSettings(honor);
        Computer.resetSettings(samsung);

        NewGameGadget.launchGame1(); // статический метод родительского класса доступен дочернему

        NewGameGadget nintendo = new NewGameGadget();
        nintendo.finishGame1();// нестатический метод доступен после создания объекта класса
        OldGameGadget nes = new OldGameGadget(1.1);
    }
}