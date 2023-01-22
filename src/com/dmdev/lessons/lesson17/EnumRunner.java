package com.dmdev.lessons.lesson17;

import java.util.Arrays;

public class EnumRunner {
    public static void main(String[] args) {
        ProcessorType bit32 = ProcessorType.BIT_32;
        System.out.println(bit32);
        System.out.println("метод name: " + bit32.name());
        System.out.println("метод toString: " + bit32);
        System.out.println("метод valueOf: " + ProcessorType.valueOf("BIT_32"));
        System.out.println("метод Arrays.toString от processorType.values: " + Arrays.toString(ProcessorType.values()));
        System.out.println("порядковый номер класса BIT_32: " + ProcessorType.BIT_32.ordinal());
        System.out.println("геттер " + bit32.getName());
        System.out.println("вызываем абстрактный метод getDescription: " + bit32.getDescription());
        System.out.println("вызываем метод интерфейса Manuable: " + ProcessorType.BIT_64.getManual(ProcessorType.BIT_64.getName()));
        System.out.println("вызываем метод интерфейса Securable: " + bit32.getSecurity());
    }
}
