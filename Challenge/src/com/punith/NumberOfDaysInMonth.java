package com.punith;

import java.util.Calendar;

public class NumberOfDaysInMonth {

    // write your code her
//using built in class
//    public static int getDaysInMonth(int month,int year)
//
//    {
//
//        Calendar calender = Calendar.getInstance();
//
//        calender.set(year,month,1);
//
//        return(calender.getActualMaximum(Calendar.DAY_OF_MONTH));
//
//    }

//    Using if else and Switch
        public static boolean isLeapYear(int year){


            if((year<1) || (year>9999)){
                return false;
            }
            else if((year%4 == 0) && (year%100 != 0) || (year%400==0)){
                return true;
            }
            else{
                return false;
            }
        }
        public static int getDaysInMonth(int month,int year){
            if((month<1 || month>12)|| (year<1 || year>9999)){
                return -1;
            }


            int numberOfDays;
            switch(month) {
                case 1:
                    return numberOfDays=31;

                case 2:
                    if(isLeapYear(year)){
                        return numberOfDays=29;
                    }else {
                        return numberOfDays=28;
                    }

                case 3:
                    return numberOfDays=31;

                case 4:
                    return numberOfDays=30;

                case 5:
                    return numberOfDays=31;

                case 6:
                    return numberOfDays=30;

                case 7:
                    return numberOfDays=31;

                case 8:
                    return numberOfDays=31;

                case 9:
                    return numberOfDays=30;

                case 10:
                    return numberOfDays=31;

                case 11:
                    return numberOfDays=30;

                case 12:
                    return numberOfDays=31;
                default:
                    return -1;



            }
        }
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(5,200));
    }


}


