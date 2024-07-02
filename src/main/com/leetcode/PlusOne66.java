package com.leetcode;

public class PlusOne66 {

    public int[] plusOne(int[] digits) {
        int size = digits.length;
        int [] output = new int[digits.length];
        int carryOver = 1;

        for(int i=size-1; i>=0; i-- ) {
            //process digits[i]
            int sum = digits[i] + carryOver;
            if( sum < 10 ) {
                output[i] = sum;
                carryOver = 0;
            }
            else {
                output[i] = sum % 10;
                carryOver = sum/10;
            }
        }

        if(carryOver>0) {
            int[] shiftedOutput = new int[digits.length+1];
            shiftedOutput[0] = carryOver;
            for(int i=0; i <output.length; i++) {
                shiftedOutput[i+1] = output[i];
            }
            return shiftedOutput;
        }

        return output;
    }

}
