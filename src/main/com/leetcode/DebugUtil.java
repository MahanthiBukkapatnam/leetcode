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

}
