package com.dmdev.lessons.lesson10_string_stringbuilder_stringbuffer.part2Practice;

/**
 * Подсчитать количество всех точек, запятых и восклицательных знаков в строке.
 */
public class Task4 {
    public static void main(String[] args) {
        String value = "sfdgsdfghji .,! wkfgjh.,? ada!sd ";
        System.out.println(countSymbols(value));
    }

    static int countSymbols(String value) {
        String result = value.replace(".", "")//продолжаеем вызывать метод replace,
                // чтобы не создавать новые переменные
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }
}
