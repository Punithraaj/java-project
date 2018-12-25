package com.punith;

public class FactorPrinter {
    // write your code here
    public static void printFactors(int num) {
        if(num < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for(int i =1; i <= num /2 ;i++) {
            if(num % i == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.print(num); //num itself is a factor
    }

    public static void main(String[] args) {
        printFactors(78);
    }
}