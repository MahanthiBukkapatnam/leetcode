package com.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        printArray(nums1);
//        printArray(nums2);

        int nums1Count = nums1.length - nums2.length;
        int nums2Count = nums2.length;

//        printVariable("nums1Count", nums1Count);
//        printVariable("nums2Count", nums2Count);

        int[] result = new int[nums1.length];

        if(n==0){
            return;
        }

        int i=0, j=0;
        boolean done = false;
        int resultIndex=0;
        while(!done) {

            if(i==nums1Count && j < nums2Count) {
                //copy all the remaining nums2
                for(;j<nums2.length;j++) {
                    result[resultIndex]=nums2[j];
                    resultIndex++;
                }
                break;
            }
            if(j==nums2Count && i<nums1Count) {
                //copy all the remaining nums2
                for(;i<nums1Count;i++) {
                    result[resultIndex]=nums1[i];
                    resultIndex++;
                }
                break;
            }

            if(nums1[i] <= nums2[j] ) {
                result[resultIndex]=nums1[i];
                i++;
            }
            else if(nums2[j] < nums1[i] ) {
                result[resultIndex]=nums2[j];
                j++;
            }
            resultIndex++;
        }

//        System.out.println("Resulting array: ");
//        printArray(result);

        for(int k=0; k<result.length;k++) {
            nums1[k] = result[k];
        }

//        printArray(nums1);
//        printArray(nums2);
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
