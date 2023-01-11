package com.leetcode;

public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        // ThreadLocalRandom.current().ints().limit(5).m

        int result = r.reverse(1534236469);
        System.out.println(result);
        // int compare = 9646324351;
    }

    long digitValue(int digits, int rem) {
        if (digits == 1) {
            return rem;
        }
        long sum = 1;
        for (int i = 1; i < digits; i++) {
            sum = sum * 10;
        }
        return rem * sum;
    }

    public int reverse(int x) {

        int temp = x;
        int digits = 0;
        while (temp > 0 || (temp) != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = x;
        long sum = 0;
        if ((Integer.MAX_VALUE < x && x > 0) || (x < 0 && x < Integer.MIN_VALUE))
            return 0;
        while (digits > 0) {


            int rem = temp % 10;
            long digitValue = digitValue(digits, rem);


            sum = sum + digitValue;
            digits--;
            temp = temp / 10;
            if ((Integer.MAX_VALUE < sum && sum > 0) || (sum < 0 && sum < Integer.MIN_VALUE))
                return 0;
        }

        if ((Integer.MIN_VALUE > sum))
            return 0;

        return (int) sum;
    }
}
