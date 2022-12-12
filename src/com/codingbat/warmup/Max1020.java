package com.codingbat.warmup;

/**
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
 * or return 0 if neither is in that range.
 * <p>
 * max1020(11, 19) → 19
 * max1020(19, 11) → 19
 * max1020(11, 9) → 11
 */

public class Max1020 {
    public static void main(String[] args) {
        System.out.println(max1020solution(17, 12));
    }

    public static int max1020(int a, int b) {
        int result = 0;
        if (a > b && a >= 10 && a <= 20 || a < b && a >= 10 && a <= 20 && b > 20) {
            result = a;
        } else if (b > a && b >= 10 && b <= 20 || b < a && b >= 10 && b <= 20 && a > 20) {
            result = b;
        }
        return result;
    }

    public static int max1020solution(int a, int b) {
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
