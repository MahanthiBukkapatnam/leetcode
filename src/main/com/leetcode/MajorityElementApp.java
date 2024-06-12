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

}
