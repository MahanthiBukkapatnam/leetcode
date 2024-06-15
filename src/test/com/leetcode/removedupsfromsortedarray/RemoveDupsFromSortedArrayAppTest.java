package com.leetcode.removedupsfromsortedarray;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for com.leetcode.removedupsfromsortedarray.RemoveDupsFromSortedArrayApp2
 *
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RemoveDupsFromSortedArrayAppTest {
    RemoveDupsFromSortedArrayApp2 app = new RemoveDupsFromSortedArrayApp2();

    @Nested
    class BaseTestCases {

        @Order(2)
        @DisplayName("simple case 2")
        @Test
        void case2() {
            int [] nums = {1,2};
            int actualSize = app.removeDuplicates(nums);
            assertEquals(2, actualSize);
        }

        @Order(3)
        @DisplayName("simple case 3")
        @Test
        void case3() {
            int [] nums = {1,2,3};
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
            int[] nums = {1,1,2,3,4};

            int actualSize = app.removeDuplicates(nums);
            assertEquals(4, actualSize);
        }
    }

    @Nested
    class SortedWith2DupTestCases {

        @Order(0)
        @DisplayName("simple case 0")
        @Test
        void case0() {
            int[] nums = {1,1,2,3,4,4,4,4,4,4,4,4,4,5,6,7};

            int actualSize = app.removeDuplicates(nums);
            assertEquals(7, actualSize);
        }

        @Order(1)
        @DisplayName("simple case 1")
        @Test
        void case1() {
            int[] nums = {1,1,2,2};

            int actualSize = app.removeDuplicates(nums);
            assertEquals(2, actualSize);
        }

    }



    @Nested
    class SortedWith3DupTestCases {

        @Order(0)
        @DisplayName("simple case 0")
        @Test
        void case0() {
            int[] nums = {0,0,1,1,1,2,2,3,3,4};

            int actualSize = app.removeDuplicates(nums);
            assertEquals(5, actualSize);
        }
    }

}


