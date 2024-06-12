package com.leetcode;

import java.util.stream.IntStream;

/**
 * Remove Element
 */
public class RemoveElement {

    public static void main(String[] args) {
        System.out.println("Leetcode 27. Remove Element");
    }

    public int removeElement(int[] nums, int val) {
        System.out.println("val=[" + val + "]");
        if(nums.length==0) {
            return 0;
        }

        if(nums.length==1) {
            if(nums[0] == val) {
                return 0;
            }
            else {
                return 1;
            }
        }

        int i=0;
        int j=nums.length-1;
        int swapCount = 0;
        while( i <= j ) {

            while(i < nums.length && nums[i] != val) {
                i++;
            }
            System.out.println("i=[" + i + "]" );

            while(j >= 0 && nums[j] == val) {
                j--;
            }
            System.out.println("j=[" + j + "]" );

            if(i<=j) {
                swapCount++;
                //Swap
                System.out.println("Swapping " + i + "," + j);
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                i++;
                j--;
            }
            System.out.println("Operation: i=[" + i + "], j=[" + j + "]" );
            DebugUtil.printArray(nums);
        }

        System.out.println("End: i=[" + i + "], j=[" + j + "]" );
        DebugUtil.printArray(nums);

        return i;
    }


}
