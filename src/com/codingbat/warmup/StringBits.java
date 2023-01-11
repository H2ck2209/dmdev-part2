package com.codingbat.warmup;

/**
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 * <p>
 * stringBits("Hello") → "Hlo"
 * stringBits("Hi") → "H"
 * stringBits("Heeololeo") → "Hello"
 */

public class StringBits {
    public static void main(String[] args) {
        String test = "Hello";
        System.out.println(stringBits(test));
    }

    public static String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result = result + str.charAt(i);
            }
        }
        return result;
    }
}