package com.dmdev.lessons.lesson10.examCloudsPractice;

/**
 * Дано два числа, например 3 и 56, необходимо составить следующие строки:
 * 3 + 56 = 59
 * 3 – 56 = -53
 * 3 * 56 = 168.
 * Используем метод StringBuilder.append().
 * Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
 * Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 */

public class Task2 {
    public static void main(String[] args) {
        StringBuilder sb = getStringBuilder(3, 56);
        StringBuilder sb2 = getStringBuilder(5, 50);
        changeEqualInsert(sb);
        changeEqualReplace(sb2);
        System.out.println(sb);
        System.out.println();
        System.out.println(sb2);
    }

    public static StringBuilder getStringBuilder(int a, int b) {
        StringBuilder result = new StringBuilder();
        return result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a * b).append(".");
    }

    public static StringBuilder changeEqualInsert(StringBuilder value) {
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == ('=')) {
                value.deleteCharAt(i);
                value.insert(i, "равно");
            }
        }
        return value;
    }

    public static StringBuilder changeEqualReplace(StringBuilder value) {
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == ('=')) {
                value.replace(i, i + 1, "равно");
            }
        }
        return value;
    }
}