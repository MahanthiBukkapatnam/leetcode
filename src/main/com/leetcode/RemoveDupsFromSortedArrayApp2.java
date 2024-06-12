package com.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class RemoveDupsFromSortedArrayApp2 {

    public int removeDuplicates(int[] nums) {
        int tempIndex=0;

        int i=0;
        while(i < nums.length) {
            nums[tempIndex] = nums[i];
            tempIndex++;

            while(nums[i] == nums[i+1]) {
                i++;
            }

            i++;
        }

        return tempIndex;
    }

    void printVariable(String variableName, Object value) {
        System.out.println(variableName + " = " + "[" + value.toString() + "]");
    }
    void printArrayValue(String variableName, int index, Object value) {
        System.out.println(variableName + "[" + index + "]" + " = " + "[" + value.toString() + "]");
    }

    void printArray(int [] nums) {
        System.out.print("[");
        IntStream.range(0, nums.length).forEach(i -> {
            System.out.print(nums[i]);
            System.out.print(",");
        });
        System.out.println("]");
    }
}
