package com.dmdev.lessons.lesson10_string_stringbuilder_stringbuffer.part2Practice;

import java.util.Arrays;

/**
 * Написать метод, разбивающий строку на равные части по n символов и сохраняющую отдельные части в массив.
 * Вывести этот массив.
 */

public class Task5 {
    public static void main(String[] args) {
        String value = "1234567890";
        int n = 3;
        String[] result = split(value, n);
        System.out.println(Arrays.toString(result));// осуществляем вывод массива именно таким образом, т.к. sout(result) выведет адрес ссылки.
    }

    public static String[] split(String value, int n) {
        int arraySize = (int) Math.ceil(value.length() / (double) n);
        String[] result = new String[arraySize];
        int counter = 0;
        for (int i = 0; i < value.length(); i += n) {
            int endIndex = Math.min(value.length(), i + n);
            String substring = value.substring(i, endIndex);
            result[counter] = substring;
            counter++;
        }
        return result;
    }
}
