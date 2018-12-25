package com.punith;

public class EvenDigitSum {
    // write your code here

    public static int getEvenDigitSum(int number){

        if(number < 0){

            return -1;

        } else {
            int sum = 0;

            while (number>0){

                int firstdigit = number % 10;
                if(firstdigit%2==0)
                    sum=sum+firstdigit;

                number /= 10;

            }


            return sum;

        }
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(8946128));
    }
}
