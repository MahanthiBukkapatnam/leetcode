package com.leetcode;

public class PalindromeNumber {


    public boolean isPalindrome(int i) {
        if(i<0) {
            return false;
        }
        if(i<10) {  //Single Digit
            return true;
        }

        int increasingValue = 0;
        int reducingValue = i;

        while(true) {
            if(reducingValue<10) { //terminal case
                //System.out.println(reducingValue);
                increasingValue = increasingValue*10 + reducingValue;
                break;
            }
            int lastDigit = reducingValue % 10;
            //System.out.println(lastDigit);
            increasingValue = increasingValue*10 + lastDigit;
            reducingValue /= 10;
        }
        //System.out.println(increasingValue);

        return increasingValue==i;
    }

}
