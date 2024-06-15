package com.leetcode.removedupsfromsortedarray2;

public class RemoveDupsFromSortedArray2App {

    public int removeDuplicates(int[] nums) {
        int tempIndex = 0;

        int i = 0;
        while (i < nums.length) {
            nums[tempIndex] = nums[i];
            tempIndex++;

            if(i+1 == nums.length) {
                break;
            }

            if(nums[i] == nums[i + 1]) {
                nums[tempIndex] = nums[i+1];
                tempIndex++;
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
