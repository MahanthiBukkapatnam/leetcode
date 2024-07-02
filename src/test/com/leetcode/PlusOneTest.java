package com.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/plus-one/description/
 *
 */
public class PlusOneTest {

    PlusOne66 app = new PlusOne66();

    @Order(1)
    @DisplayName("simple case 0")
    @Test
    void case0() {
        int[] inputDigits = {0};
        int[] outputDigits = app.plusOne(inputDigits);
        assertEquals(1, outputDigits.length);
        assertEquals(1, outputDigits[0]);
    }

    @Order(2)
    @DisplayName("simple case 1")
    @Test
    void case1() {
        int[] inputDigits = {9};
        int[] outputDigits = app.plusOne(inputDigits);
        assertEquals(2, outputDigits.length);
        assertEquals(1, outputDigits[0]);
        assertEquals(0, outputDigits[1]);
    }

    @Order(2)
    @DisplayName("simple case 2")
    @Test
    void case2() {
        int[] inputDigits = {9,9,9,9,9};
        int[] outputDigits = app.plusOne(inputDigits);
        assertEquals(6, outputDigits.length);
        assertEquals(1, outputDigits[0]);
        assertEquals(0, outputDigits[1]);
        assertEquals(0, outputDigits[2]);
        assertEquals(0, outputDigits[3]);
        assertEquals(0, outputDigits[4]);
        assertEquals(0, outputDigits[5]);
    }

    @Order(3)
    @DisplayName("simple case 3")
    @Test
    void case3() {
        //
    }

    @Order(4)
    @DisplayName("simple case 4")
    @Test
    void case4() {
        //
    }

    @Order(5)
    @DisplayName("simple case 5")
    @Test
    void case5() {
        //
    }

    @Order(6)
    @Test
    void case6() {
        //
    }

}
