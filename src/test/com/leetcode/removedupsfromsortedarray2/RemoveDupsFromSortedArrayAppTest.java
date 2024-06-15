package com.leetcode.removedupsfromsortedarray2;

import com.leetcode.AssertArrayUtil;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for com.leetcode.removedupsfromsortedarray.RemoveDupsFromSortedArrayApp2
 * <p>
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RemoveDupsFromSortedArrayAppTest {
    RemoveDupsFromSortedArray2App app = new RemoveDupsFromSortedArray2App();

    @Nested
    class BaseTestCases {

        @Order(2)
        @DisplayName("simple case 2")
        @Test
        void case2() {
            int[] nums = {1, 2};
            int actualSize = app.removeDuplicates(nums);
            assertEquals(2, actualSize);
        }

        @Order(3)
        @DisplayName("simple case 3")
        @Test
        void case3() {
            int[] nums = {1, 2, 3};
            int actualSize = app.removeDuplicates(nums);
            assertEquals(3, actualSize);
        }
    }


    @Nested
    class SortedWith1DupTestCases {

        @Order(0)
        @DisplayName("simple case 0")
        @Test
        void case0() {
            int[] nums = {1, 1, 2, 3, 4};

            int actualSize = app.removeDuplicates(nums);
            assertEquals(5, actualSize);
        }
    }

    @Nested
    class SortedWith2DupTestCases {

        @Order(0)
        @DisplayName("simple case 4 - 2 are duplicated")
        @Test
        void case1() {
            int[] nums = {1, 1, 2, 2};

            int actualSize = app.removeDuplicates(nums);
            int[] expected = {1, 1, 2, 2};
            AssertArrayUtil.assertArrayEquals(4, expected, nums);
        }

        @Order(1)
        @DisplayName("simple case - 2 numbers are duplicated")
        @Test
        void case0() {
            int[] nums = {1, 1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 6, 7};

            int actualSize = app.removeDuplicates(nums);
            assertEquals(9, actualSize);

            int[] expected = {1, 1, 2, 3, 4, 4, 5, 6, 7};
            AssertArrayUtil.assertArrayEquals(9, expected, nums);
        }

    }


    @Nested
    class SortedWith3DupTestCases {

        @Order(0)
        @DisplayName("simple case 0")
        @Test
        void case0() {
            int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4};

            int actualSize = app.removeDuplicates(nums);
            assertEquals(9, actualSize);
            int[] expected = {0, 0, 1, 1, 2, 2, 3, 3, 4};
            AssertArrayUtil.assertArrayEquals(9, expected, nums);
        }
    }

}


