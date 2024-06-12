package com.leetcode;

import com.leetcode.MergeSortedArray;
import org.junit.jupiter.api.*;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for com.leetcode.RemoveElement
 *
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MergeSortedArrayTest {
    MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Order(1)
    @DisplayName("empty case")
    @Test
    void invocationTest() {
        int [] nums1 = {};
        int m=0;
        int [] nums2 = {};
        int n=0;
        mergeSortedArray.merge(nums1,0,nums2,n);
    }

    @Order(2)
    @DisplayName("nums1 has 1 element, nums2 has 0")
    @Test
    void mergeCase1() {
        int [] nums1 = {1};
        int [] nums2 = {};
        mergeSortedArray.merge(nums1,nums1.length,nums2,nums2.length);
        int [] expected = {1};
        assertArrayEquals(expected, nums1);
    }

    @Order(3)
    @DisplayName("nums1 has 0 element, nums2 has 1")
    @Test
    void mergeCase2() {
        int [] nums1 = {0};
        int [] nums2 = {1};
        mergeSortedArray.merge(nums1,nums1.length,nums2,nums2.length);
        int [] expected = {1};
        assertArrayEquals(expected, nums1);
    }

    @Order(4)
    @DisplayName("nums1 has 1 element, nums2 has 1")
    @Test
    void mergeCase3() {
        int [] nums1 = {1,0};
        int [] nums2 = {1};
        mergeSortedArray.merge(nums1,nums1.length,nums2,nums2.length);
        int [] expected = {1,1};
        assertArrayEquals(expected, nums1);
    }

    @Order(5)
    @DisplayName("nums1 has 1 element, nums2 has 1")
    @Test
    void mergeCase4() {
        int [] nums1 = {1,0};
        int [] nums2 = {2};
        mergeSortedArray.merge(nums1,nums1.length,nums2,nums2.length);
        int [] expected = {1,2};
        assertArrayEquals(expected, nums1);
    }

    @Order(6)
    @DisplayName("Case 1 from leetcode")
    @Test
    void mergeCase5() {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        mergeSortedArray.merge(nums1,nums1.length,nums2,nums2.length);
        int [] expected = {1,2,2,3,5,6};
        assertArrayEquals(expected, nums1);
    }


    @Order(7)
    @DisplayName("Case 2 from leetcode")
    @Test
    void mergeCase6() {
        int [] nums1 = {-1,0,0,3,3,3,0,0,0};
        int [] nums2 = {1,2,2};
        mergeSortedArray.merge(nums1,nums1.length,nums2,nums2.length);
        int [] expected = {-1,0,0,1,2,2,3,3,3};
        assertArrayEquals(expected, nums1);
    }


    void assertArrayEquals(int []expected, int []actual) {
        assertEquals(expected.length, actual.length);
        for(int i=0; i<expected.length; i++ ) {
            assertEquals(expected[i], actual[i]);
        }
    }

    void printArray(int [] nums) {
        IntStream.range(0, nums.length).forEach(i -> {
            System.out.print(nums[i]);
            System.out.print(",");
        });
        System.out.println();
    }
}


