package com.leetcode;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebugUtilTest {

    DebugUtil app = new DebugUtil();

    @Nested
    class ReverseTestCases {
        @Test
        void reverseForNull() {
            assertEquals("llun", app.reverse(null));
        }

        @Test
        void reverseForEmpty() {
            assertEquals("", app.reverse(""));
        }

        @Test
        void reverseForA() {
            assertEquals("A", app.reverse("A"));
        }

        @Test
        void reverseForAB() {
            assertEquals("BA", app.reverse("AB"));
        }

        @Test
        void reverseForABC() {
            assertEquals("CBA", app.reverse("ABC"));
        }
    }


}
