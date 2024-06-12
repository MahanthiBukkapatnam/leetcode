package com.leetcode;

//public static Stream<com.leetcode.TestCase> methodSource() {
//        List<com.leetcode.TestCase> cases = new ArrayList<>();
//
//        //case1
//        com.leetcode.TestCase case1 = new com.leetcode.TestCase(0,new int[0],0);
//        cases.add(case1);
//
//        return cases.stream();
//        }


public class TestCase {
    int result;
    int nums[] = null;
    int val;

    public TestCase(int result, int[] nums, int val) {
        this.result = result;
        this.nums = nums;
        this.val = val;
    }
}