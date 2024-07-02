package com.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/add-binary/description/
 *
 */
public class AddBinary67Test {

    AddBinary67 app = new AddBinary67();

    @Order(1)
    @DisplayName("simple case 0")
    @Test
    void case0() {
        assertEquals("0", app.addBinary("0","0"));
    }

    @Order(2)
    @DisplayName("simple case 1")
    @Test
    void case1() {
        assertEquals("1", app.addBinary("1","0"));
        assertEquals("1", app.addBinary("0","1"));
    }

    @Order(2)
    @DisplayName("simple case 2")
    @Test
    void case2() {
        assertEquals("10", app.addBinary("1","1"));
    }

    @Order(3)
    @DisplayName("simple case 3")
    @Test
    void case3() {
        assertEquals("110", app.addBinary("11","11"));
    }

    @Order(4)
    @DisplayName("simple case 4")
    @Test
    void case4() {
        assertEquals("10101", app.addBinary("1010","1011"));
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
