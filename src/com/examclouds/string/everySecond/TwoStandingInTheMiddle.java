package com.examclouds.string.everySecond;

public class TwoStandingInTheMiddle {

    public static void main(String[] args) {
        String test = "Return";
        System.out.println(twoInTheMiddle(test));
        String test2 = "Barbara Streisand";
        System.out.println(twoInTheMiddle(test2));
    }

    public static String twoInTheMiddle(String str) {
        String result = "";
        if (str.length() % 2 == 0) {
        result = str.substring(str.length()/2 - 1, str.length()/2 + 1);
        }else result = "Длина данной строки нечетная";
        return result;
    }
}
