package com.leetcode.removedupsfromsortedarray;

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

            if(i+1 == nums.length) {
                break;
            }
            while (nums[i] == nums[i + 1]) {
                i++;
                if(i+1 == nums.length) {
                    break;
                }
            }

            i++;
        }

        return tempIndex;
    }

}
