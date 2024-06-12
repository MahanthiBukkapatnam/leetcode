package com.leetcode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for com.leetcode.RemoveElement
 *
 */
public class RemoveElementTest {
    RemoveElement removeElement = new RemoveElement();

    @Disabled
    @DisplayName("Null parameter")
    @Test
    void invocationTest() {
        Exception ex = assertThrows(RuntimeException.class, () -> removeElement.removeElement(null,0));
    }

    @DisplayName("Empty array")
    @Test
    void emptyArray() {
        int result = removeElement.removeElement(new int[0],0);
        assertEquals(0, result);
    }

    @DisplayName("2 Element - with value")
    @Test
    void twoElementWith2Value_case2() {
        int nums[] = {1,1};
        DebugUtil.printArray(nums);
        int result = removeElement.removeElement(nums,1);
        DebugUtil.printArray(nums);
        assertEquals(0, result);
    }

    @DisplayName("Single Element - without value")
    @Test
    void singleElementWithoutValue_case1() {
        int nums[] = {1};
        DebugUtil.printArray(nums);
        int result = removeElement.removeElement(nums,0);
        DebugUtil.printArray(nums);
        assertEquals(1, result);
    }

    @DisplayName("Two Element - without value")
    @Test
    void twoElementWithoutValue_case1() {
        int nums[] = {1,2};
        DebugUtil.printArray(nums);
        int result = removeElement.removeElement(nums,0);
        DebugUtil.printArray(nums);
        assertEquals(2, result);
    }

    @DisplayName("Two Element - with value")
    @Test
    void twoElementWithValue_case1() {
        int nums[] = {1,2};
        DebugUtil.printArray(nums);
        int result = removeElement.removeElement(nums,2);
        DebugUtil.printArray(nums);
        assertEquals(1, result);
    }

    @DisplayName("Two Element - with value")
    @Test
    void twoElementWithValue_case2() {
        int nums[] = {1,2};
        DebugUtil.printArray(nums);
        int result = removeElement.removeElement(nums,1);
        DebugUtil.printArray(nums);
        assertEquals(1, result);
    }

    @DisplayName("Two Element - with value")
    @Test
    void twoElementWithValue_case3() {
        int nums[] = {2,1};
        DebugUtil.printArray(nums);
        int result = removeElement.removeElement(nums,1);
        DebugUtil.printArray(nums);
        assertEquals(1, result);
        assertEquals(2, nums[0]);
        assertEquals(1, nums[1]);
    }

    @Test
    void case1() {
        int nums[] = {3,2,2,3};
        DebugUtil.printArray(nums);
        int result = removeElement.removeElement(nums,3);

        assertEquals(2, result);

        DebugUtil.printArray(nums);

        assertEquals(2, nums[0]);
        assertEquals(2, nums[1]);
        assertEquals(3, nums[2]);
        assertEquals(3, nums[3]);
    }

    @Test
    void case2() {
        int nums[] = {4,5};
        DebugUtil.printArray(nums);
        int result = removeElement.removeElement(nums,5);

        assertEquals(1, result);

        DebugUtil.printArray(nums);

        assertEquals(4, nums[0]);
        assertEquals(5, nums[1]);
    }

    @Test
    void case3() {
        int nums[] = {2,2,3};
        DebugUtil.printArray(nums);
        int result = removeElement.removeElement(nums,2);

        assertEquals(1, result);

        DebugUtil.printArray(nums);

        assertEquals(3, nums[0]);
        assertEquals(2, nums[1]);
        assertEquals(2, nums[2]);
    }

}


