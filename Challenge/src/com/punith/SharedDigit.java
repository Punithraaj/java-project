package com.punith;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNum, int secondNum) {

        if (firstNum < 10 || secondNum < 10 || firstNum > 99 || secondNum > 99) {
            return false;
        }

        while (firstNum > 0) {

            int firstDigit = firstNum % 10;
            int resetSecondNum = secondNum;

            while (secondNum > 0) {

                int secondDigit = secondNum % 10;

                if (firstDigit == secondDigit) {
                    return true;
                }

                if (secondNum > 9) {
                    secondNum /= 10;
                } else {
                    secondNum = resetSecondNum;
                    break;
                }
            }
            if (firstNum > 9) {
                firstNum /= 10;
            } else {
                break;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(78,87));
    }
}
