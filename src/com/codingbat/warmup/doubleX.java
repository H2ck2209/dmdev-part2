package com.codingbat.warmup;

public class doubleX {
    public static void main(String[] args) {
        String str = "xxxx";
        System.out.println(doubleX(str));

    }

    static boolean doubleX(String str) {
        int i = str.indexOf('x');
        return (i < str.length() - 1 && str.charAt(i + 1) == 'x');
        }
    }
