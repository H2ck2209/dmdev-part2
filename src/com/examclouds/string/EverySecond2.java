package com.examclouds.string;

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

public class EverySecond2 {
    public static void main(String[] args) {
        String str = "Me Me Me. Me. Me. Me.";

        String desired = "Me";
        String target = "They";

        var result = replacer(str, desired, target);
        System.out.println(result);
    }

    static String replacer(String str, String desired, String target) {
        var strArray = str.split("\\.");
        StringBuffer result = new StringBuffer();
        int count = 0;

        for (int i = 0; i < strArray.length; i++) {
            var stringBuffer = new StringBuffer();
            var firstIndex = 0;
            var lastIndex = 0;
            var fromIndex = 0;

            var currentString = strArray[i];
            stringBuffer.append(currentString);

            while (firstIndex != -1) {
                firstIndex = stringBuffer.indexOf(desired, fromIndex);

                if (firstIndex == -1) break;

                lastIndex = firstIndex + desired.length();
                count++;

                if (count % 2 == 0) {
                    stringBuffer.replace(firstIndex, lastIndex, target);
                } else {
                    fromIndex = lastIndex;
                }
            }

            result.append(stringBuffer).append(".");
        }

        return result.toString();
    }
}