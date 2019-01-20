package com.punith;

public class Longest_Substring {

    public static int evaluate(String str,int n,int i)
    {
        int count=0;
        int max=0;
            while(i<n) {
                System.out.println(i+""+n);
                int j = i + 1;
                if (j < n) {
                    if (str.charAt(i) + 1 == str.charAt(j)) {
                        i++;
                        count++;
                    } else {
                        if (max < count) {
                            max = count;
                            count = 0;
                        }
                        i++;
                    }
                }
                else {
                    break;
                }
            }
            return max;
    }
    public static void main(String[] args) {
        String str ="punithraj";
        System.out.println(evaluate(str,str.length(),0));
    }
}
