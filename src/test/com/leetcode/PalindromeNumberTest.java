package com.leetcode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for com.leetcode.PalindromeNumber
 *
 */
public class PalindromeNumberTest {
    PalindromeNumber app = new PalindromeNumber();

    @Disabled
    @DisplayName("Null parameter")
    @Test
    void invocationTest() {
//        Exception ex = assertThrows(RuntimeException.class, () -> removeElement.removeElement(null,0));
    }

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


    @DisplayName("For Single Numbers")
    @Test
    void forSingleNumber() {
        assertTrue(app.isPalindrome(0));
        assertTrue(app.isPalindrome(1));
        assertTrue(app.isPalindrome(2));
        assertTrue(app.isPalindrome(3));
        assertTrue(app.isPalindrome(4));
        assertTrue(app.isPalindrome(5));
        assertTrue(app.isPalindrome(6));
        assertTrue(app.isPalindrome(7));
        assertTrue(app.isPalindrome(8));
        assertTrue(app.isPalindrome(9));
    }

    @DisplayName("For 2 Digit Numbers")
    @Test
    void forTwoDigitNumber() {
        assertFalse(app.isPalindrome(10));
        assertTrue(app.isPalindrome(11));
        assertFalse(app.isPalindrome(12));
        assertFalse(app.isPalindrome(13));
        assertFalse(app.isPalindrome(14));
        assertFalse(app.isPalindrome(15));
        assertFalse(app.isPalindrome(19));
        assertFalse(app.isPalindrome(20));
        assertFalse(app.isPalindrome(21));
        assertTrue(app.isPalindrome(22));
        assertFalse(app.isPalindrome(23));
    }

    @DisplayName("For Negative Numbers")
    @Test
    void forNegativeNumber() {
        assertFalse(app.isPalindrome(-1));
        assertFalse(app.isPalindrome(-2));
        assertFalse(app.isPalindrome(-3));
    }

    @DisplayName("For 1")
    @Test
    void for0() {
        assertTrue(app.isPalindrome(0));
    }

}


