package com.dmdev.lessons.lesson17;

import java.io.PrintStream;
import java.util.Arrays;

public class EnumRunner {
    public static void main(String[] args) {
        ProcessorType processorType = ProcessorType.BIT_32;
        System.out.println(processorType);
        System.out.println("метод name: " + processorType.name());
        System.out.println("метод toString: " + processorType.toString());
        System.out.println("метод valueOf: " + processorType.valueOf("BIT_32"));
        System.out.println("метод Arrays.toString от processorType.values: " + Arrays.toString(processorType.values()));
        System.out.println("порядковый номер класса BIT_32: " + processorType.BIT_32.ordinal());
        System.out.println("геттер " + processorType.getName());
        System.out.println("вызываем абстрактный метод getDescription: " + processorType.getDescription());
        System.out.println("вызываем метод интерфейса Manuable: " + processorType.BIT_64.getManual());
        System.out.println("вызываем метод интерфейса Securable: " + processorType.getSecurity());
    }
}
