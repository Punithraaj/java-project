package com.punith;

public class GreatestCommonDivisor {
    // write your code here
    public static int getGreatestCommonDivisor(int num1, int num2){
        if(num1 < 10 || num2 < 10){
            return -1;
        }

        int counter = num1 > num2 ? num2 : num1;

        while(counter != 0){

            if((num1 % counter == 0) && (num2 % counter == 0)){
                return counter;
            }

            counter--;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(78,34));
    }
}
