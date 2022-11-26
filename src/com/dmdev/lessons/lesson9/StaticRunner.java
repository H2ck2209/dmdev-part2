package com.dmdev.lessons.lesson9;

import com.dmdev.lessons.lesson7.Computer;

public class StaticRunner {
    public static void main(String[] args) {
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        Computer computer2 = new Computer(null, null);
        Computer computer = new Computer(null, null);
//        Computer computer = new Computer(null, null); доступ через ссылку экземпляра нежелетален, т.к. метод относится
//        System.out.println(computer.getCounter());    к полю класса
        System.out.println(Computer.getCounter());
        Class<? extends Computer> clazz = computer.getClass();//getClass возвращает класс, к которому принадлежит экземпляр
        Class<? extends Computer> clazz2 = computer2.getClass();

        //MetaSpace - область памяти в Heap для хранения хранения классов

        System.out.println(clazz == clazz2);// true, потому что ссылаемся на один класс
        System.out.println(computer == computer2); //false, потому что это два разных объекта

/**
 static часто используется для утилитных классов, которым не нужен конкретный экземляр, чтобы его использовать.
 Например Math - класс математических операций.

 */

    }
}
