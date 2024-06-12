package com.leetcode;

import java.util.*;
import java.util.stream.IntStream;

public class MajorityElementApp {

    public int majorityElement(int[] nums) {

        int maxValue=nums[0];
        int maxCount=1;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int value = nums[i];
            if(map.containsKey(value) ) {
                int newCount = map.get(value) + 1;
                map.put(value, newCount);
                if(newCount > maxCount ) {
                    maxCount = newCount;
                    maxValue = value;
                }
            }
            else {
                map.put(value,1);
            }
        }
        return maxValue;
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
