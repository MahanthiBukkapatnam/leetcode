package com.leetcode;

import java.util.stream.IntStream;


public class DebugUtil {

    public static void printArray(int [] nums) {
        System.out.print("[");
        IntStream.range(0, nums.length).forEach(i -> {
            System.out.print(nums[i]);
            System.out.print(",");
        });
        System.out.println();
    }

    void printVariable(String variableName, Object value) {
        System.out.println(variableName + " = " + "[" + value.toString() + "]");
    }
    void printArrayValue(String variableName, int index, Object value) {
        System.out.println(variableName + "[" + index + "]" + " = " + "[" + value.toString() + "]");
    }


    public String reverse(String value) {
        String valueStr = "" + value;
        char [] revChars = new char[valueStr.length()];

        int j=valueStr.length()-1;
        for(int i=0; i<=valueStr.length()-1; i++) {
            revChars[j] = valueStr.charAt(i);
            j--;
        }

        return new String(revChars);
    }

}
