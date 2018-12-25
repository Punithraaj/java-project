package com.punith;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        if(number < 0){

            return -1;

        } else {

            int lastdigit = number % 10;

            int firstdigit = 0;

            while (number>0){

                firstdigit = number % 10;

                number /= 10;

            }

            int sum = firstdigit + lastdigit;

            return sum;

        }
    }
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(222));
    }
}
