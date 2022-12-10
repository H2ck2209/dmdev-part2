package com.examclouds.string;

import java.util.Locale;

/**
 * Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming»
 * (не учитываем регистр символов) на «OOP». Например, строка
 * <p>
 * "Object-oriented programming is a programming language model
 * organized around objects rather than "actions" and data rather than logic.
 * Object-oriented programming blabla. Object-oriented programming bla."
 * <p>
 * должна быть преобразована в
 * <p>
 * "Object-oriented programming is a programming language model organized around objects rather
 * than "actions" and data rather than logic. OOP blabla. Object-oriented programming bla."
 */

public class EverySecond {
    public static void main(String[] args) {
        String str = "We. We. We. We.";
        System.out.println(replacer(str, "We", "They"));
    }

    static String replacer(String str, String target, String substitute) {
        String result = "";
        int count = 0;
        for (int i = 0; i < str.length() - target.length(); i++) {
            String tempString = str.substring(i, i + target.length());
            if (tempString.equals(target)) {
                count++;
                if (count % 2 == 0) {
                    String start = str.substring(0, i);
                    String end = str.substring(i).replaceFirst(target, substitute);
                    result = start + end;
                }
            }
        }return result;
    }
}