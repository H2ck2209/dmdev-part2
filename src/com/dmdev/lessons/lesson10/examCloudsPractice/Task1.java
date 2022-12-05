package com.dmdev.lessons.lesson10.examCloudsPractice;

import java.util.Locale;

/**
 * Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
 * Распечатать последний символ строки. Используем метод String.charAt().
 * Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 * Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
 * Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
 * Найти позицию подстроки “Java” в строке “I like Java!!!”.
 * Заменить все символы “а” на “о”.
 * Преобразуйте строку к верхнему регистру.
 * Преобразуйте строку к нижнему регистру.
 * Вырезать строку Java c помощью метода String.substring().
 */
public class Task1 {
    public static void main(String[] args) {
        String value = "I like Java!!!";
        stringPrinter(value);

        System.out.println(value.charAt(value.length()-1));

        System.out.println(value.endsWith("!!!"));

        System.out.println(value.startsWith("I like"));

        System.out.println(value.contains("Java"));

        System.out.println(value.indexOf("Java"));

        System.out.println(value.replace('a', 'o'));

        System.out.println(value.toUpperCase(Locale.ROOT));

        System.out.println(value.toLowerCase());

        System.out.println(value.substring(value.indexOf("Java"), value.indexOf("!!!"))); // TODO: 06.12.2022 как не хардкодить?
    }

    public static void stringPrinter(String value) {
        System.out.println(value);
    }
}
