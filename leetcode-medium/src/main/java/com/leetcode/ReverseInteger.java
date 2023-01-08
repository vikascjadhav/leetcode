package com.leetcode;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        // ThreadLocalRandom.current().ints().limit(5).m
        System.out.println(r.reverse(123));;
    }

    int digitValue(int digits, int rem) {
        if (digits == 1) {
            return rem;
        }
        int sum = 1;
        for (int i = 1; i < digits; i++) {
            sum = sum * 10;
        }
        return rem * sum;
    }

    public int reverse(int x) {

        int temp = Math.abs(x);
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        temp = Math.abs(x);
        int sum = 0;
        while (digits >= 0) {

            int rem = temp % 10;

            sum = sum + digitValue(digits, rem);
            digits--;
            temp = temp / 10;
        }

        if (x < 0) {
            sum = -sum;
        }

        return sum;
    }
}
