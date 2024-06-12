package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class RemoveDupsFromSortedArrayApp {

    public int removeDuplicates(int[] nums) {
        int i=0;
        int total = nums.length;
        int totalSkipped = 0;
        int totalLeft=0;

        while(i < total-totalSkipped) {
//            System.out.println("-----------");
//            printVariable(" i", i);
//            printVariable(" totalSkipped", totalSkipped);
//            System.out.print("  ");
//            printArray(nums);

            int currentValueIndex=i;

//            printVariable("currentValueIndex", currentValueIndex);
            int j=i;
            while(j < nums.length-1 && nums[j] == nums[j+1]) {
                totalSkipped++;
                j++;
            }
            totalLeft = total - totalSkipped;
//            printVariable("totalLeft", totalLeft);

            int nextValueIndex = j+1;

//            printVariable("nextValueIndex", nextValueIndex);
            collapse(nums, currentValueIndex+1,nextValueIndex);
            i++;
        }

//        printArray(nums);
        return i;
    }

    void collapse(int []nums, int start, int end) {
        int startIndex= start;
        int endIndex = end;

        for(int i=end; i<nums.length; i++) {
            nums[startIndex] = nums[endIndex];
            startIndex++;
            endIndex++;
        }
    }

}
