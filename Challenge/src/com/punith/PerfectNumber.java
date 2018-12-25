package com.punith;

public class PerfectNumber {

    public static boolean isPerfectNumber(int n) {

        if(n < 1)

            return false;

        int sum = 1;

        for(int i = 2; i <= n/2; i++) {

            if(n % i == 0)

                sum += i;

        }

        return sum==n;

    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(87));
    }

}