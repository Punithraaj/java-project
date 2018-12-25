package com.punith;

public class NumberPalindrome {

    public static boolean isPalindrome(int number)
    {
        String str = new StringBuilder(Integer.toString(number)).reverse().toString().replace("-","");
        System.out.println(str);
        if(str.equals(Integer.toString(number).replace("-","")))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }
}