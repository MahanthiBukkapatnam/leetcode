package com.leetcode.rotatearray;

import com.leetcode.AssertArrayUtil;
import com.leetcode.MajorityElementApp;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for com.leetcode.RotateArray
 *
 * https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
 *
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RotateArrayTest {
    RotateArray app = new RotateArray();

    @Nested
    class BoundaryCases {
        @Order(0)
        @DisplayName("simple case, 1 element, k=-1")
        @Test
        void case0() {
            int [] nums = {1};
            app.rotate(nums,-1);
            int[] expected = {1};
            AssertArrayUtil.assertArrayEquals(1, expected, nums);
        }

        @Order(1)
        @DisplayName("simple case, 1 element, k=0")
        @Test
        void case1() {
            int [] nums = {1};
            app.rotate(nums,0);
            int[] expected = {1};
            AssertArrayUtil.assertArrayEquals(1, expected, nums);
        }

        @Order(2)
        @DisplayName("simple case, 1 element, k=1")
        @Test
        void case2() {
            int [] nums = {1};
            app.rotate(nums,1);
            int[] expected = {1};
            AssertArrayUtil.assertArrayEquals(1, expected, nums);
        }

        @Order(3)
        @DisplayName("simple case, 2 element, k=2")
        @Test
        void case3() {
            int [] nums = {1,2};
            app.rotate(nums,2);
            int[] expected = {1,2};
            AssertArrayUtil.assertArrayEquals(2, expected, nums);
        }

    }

    @Nested
    class NisEvenCases {

        @Order(0)
        @DisplayName("n=even. r>s")
        @Test
        void case0() {
            int [] nums = {1,2,3,4};
            app.rotate(nums,1);
            int[] expected = {4,1,2,3};
            AssertArrayUtil.assertArrayEquals(4, expected, nums);
        }

        @Order(1)
        @DisplayName("n=even. r==s")
        @Test
        void case1() {
            int [] nums = {1,2};
            app.rotate(nums,1);
            int[] expected = {2,1};
            AssertArrayUtil.assertArrayEquals(2, expected, nums);
        }

        @Order(2)
        @DisplayName("n=even. r<s")
        @Test
        void case2() {
            int [] nums = {1,2,3,4,5,6};
            app.rotate(nums,4);
            int[] expected = {3,4,5,6,1,2};
            AssertArrayUtil.assertArrayEquals(6, expected, nums);
        }
    }

    @Nested
    class NisOddCases {

        @Order(0)
        @DisplayName("n=odd. r>k")
        @Test
        void case0() {
            int [] nums = {1,2,3};
            app.rotate(nums,1);
            int[] expected = {3,1,2};
            AssertArrayUtil.assertArrayEquals(3, expected, nums);
        }
        @Order(1)
        @DisplayName("n=odd. r>k")
        @Test
        void case01() {
            int [] nums = {1,2,3,4,5,6,7};
            app.rotate(nums,2);
            int[] expected = {6,7,1,2,3,4,5};
            AssertArrayUtil.assertArrayEquals(7, expected, nums);
        }

        @Order(2)
        @DisplayName("n=odd. r>k")
        @Test
        void case02() {
            int[] nums = {1,2,3,4,5,6,7};
            app.rotate(nums, 3);
            int[] expected = {5,6,7,1,2,3,4};
            AssertArrayUtil.assertArrayEquals(7, expected, nums);
        }

        @Order(2)
        @DisplayName("n=odd. r>k")
        @Test
        void case03() {
            int [] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
            app.rotate(nums,38);
            int[] expected = {17,18,19,20,21,22,23,24,25,26,27,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
            AssertArrayUtil.assertArrayEquals(27, expected, nums);
        }

        @Order(3)
        @DisplayName("n=odd. r<k")
        @Test
        void case1() {
            int [] nums = {1,2,3};
            app.rotate(nums,2);
            int[] expected = {2,3,1};
            AssertArrayUtil.assertArrayEquals(3, expected, nums);
        }

    }

    @DisplayName("LeetCode Problem")
    @Test
    void case0() {
        int [] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        app.rotate(nums,29);
        int[] expected = {14,15,16,17,18,19,20,21,1,2,3,4,5,6,7,8,9,10,11,12,13};
        AssertArrayUtil.assertArrayEquals(21, expected, nums);
    }

}


