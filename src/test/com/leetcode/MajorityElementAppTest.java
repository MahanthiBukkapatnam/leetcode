package com.leetcode;

import com.leetcode.MajorityElementApp;
import org.junit.jupiter.api.*;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for com.leetcode.RemoveElement
 *
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MajorityElementAppTest {
    MajorityElementApp majorityElementApp = new MajorityElementApp();

    @Order(1)
    @DisplayName("simple case")
    @Test
    void case0() {
        int [] nums = {1};
        int majorityElement = majorityElementApp.majorityElement(nums);
        assertEquals(1, majorityElement);
    }

    @Order(1)
    @DisplayName("simple case 1")
    @Test
    void case1() {
        int [] nums = {1,1};
        int majorityElement = majorityElementApp.majorityElement(nums);
        assertEquals(1, majorityElement);
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


