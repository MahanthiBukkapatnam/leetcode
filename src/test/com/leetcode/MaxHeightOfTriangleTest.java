package com.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxHeightOfTriangleTest {

    MaxHeightOfTriangle app = new MaxHeightOfTriangle();

    @Order(1)
    @DisplayName("simple case 0")
    @Test
    void case0() {
        assertEquals(0, app.maxHeightOfTriangle(0,0));
    }

    @Order(2)
    @DisplayName("simple case 1")
    @Test
    void case1() {
        assertEquals(1, app.maxHeightOfTriangle(1,0));
        assertEquals(1, app.maxHeightOfTriangle(0,1));
        assertEquals(1, app.maxHeightOfTriangle(0,2));
        assertEquals(1, app.maxHeightOfTriangle(2,0));
    }

    @Order(2)
    @DisplayName("simple case 2")
    @Test
    void case2() {
        assertEquals(1, app.maxHeightOfTriangle(1,1));
    }

    @Order(3)
    @DisplayName("simple case 3")
    @Test
    void case3() {
        assertEquals(2, app.maxHeightOfTriangle(1,2));
        assertEquals(2, app.maxHeightOfTriangle(2,1));
    }

    @Order(4)
    @DisplayName("simple case 4")
    @Test
    void case4() {
        assertEquals(2, app.maxHeightOfTriangle(2,2));
    }

    @Order(5)
    @DisplayName("simple case 5")
    @Test
    void case5() {
        assertEquals(2, app.maxHeightOfTriangle(2,3));
        assertEquals(2, app.maxHeightOfTriangle(3,2));
    }

    @Order(6)
    @Test
    void case6() {
        assertEquals(3, app.maxHeightOfTriangle(2,4));
        assertEquals(3, app.maxHeightOfTriangle(4,2));
    }

    @Order(6)
    @Test
    void case7() {
        assertEquals(3, app.maxHeightOfTriangle(2,40));
        assertEquals(3, app.maxHeightOfTriangle(40,2));
    }

    @Order(7)
    @Test
    void case8() {
        assertEquals(12, app.maxHeightOfTriangle(42,43));
    }

    @Order(8)
    @Test
    void case9() {
        assertEquals(3, app.maxHeightOfTriangle(9,3));
    }

    @Test
    void printTable() {
        for(int n=1; n<40; n++) {
            System.out.print("n=" + n + ", EvenCount=[" + app.getEvenCount(n) + "], OddCount=[" + app.getOddCount(n) + "]" );
            System.out.println();
        }
    }

}
