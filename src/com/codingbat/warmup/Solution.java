package com.codingbat.warmup;

public class Solution {
    public static void main(String[] args) {
        System.out.println(max1020(7, 11));
    }

    public static int max1020(int a, int b) {
        // First make it so the bigger value is in a
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
}
