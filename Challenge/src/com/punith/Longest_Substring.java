package com.punith;

public class Longest_Substring {

    public static int evaluate(String str,int n,int i)
    {
        int count=0;
        int max=0;
            while(i<n) {
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
            return max+1;
    }
    public static void main(String[] args) {
        String str ="124567825";
        System.out.println(evaluate(str,str.length(),0));
    }
}
