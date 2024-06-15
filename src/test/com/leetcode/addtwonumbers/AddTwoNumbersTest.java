package com.leetcode.addtwonumbers;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for com.leetcode.AddTwoNumbers
 *
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AddTwoNumbersTest {
    AddTwoNumbers app = new AddTwoNumbers();

    @Disabled
    @DisplayName("Null parameters")
    @Test
    void invocationTest() {
        Exception ex = assertThrows(RuntimeException.class, () -> app.addTwoNumbers(null, null));
    }

    @Order(1)
    @DisplayName("simple case")
    @Test
    void case0() {
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(0);

        ListNode listNodeResult = app.addTwoNumbers(listNode1, listNode2);
        assertNotNull(listNodeResult);
        assertEquals(0, listNodeResult.val);
        assertNull(listNodeResult.next);
    }

    @Order(2)
    @DisplayName("simple case 2")
    @Test
    void case1() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(0);

        ListNode listNodeResult = app.addTwoNumbers(listNode1, listNode2);
        assertNotNull(listNodeResult);
        assertEquals(1, listNodeResult.val);
        assertNull(listNodeResult.next);
    }

    @Order(2)
    @DisplayName("simple case 2")
    @Test
    void case11() {
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(1);

        ListNode listNodeResult = app.addTwoNumbers(listNode1, listNode2);
        assertNotNull(listNodeResult);
        assertEquals(1, listNodeResult.val);
        assertNull(listNodeResult.next);
    }

    @Order(3)
    @DisplayName("simple case 3")
    @Test
    void case2() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);

        ListNode listNodeResult = app.addTwoNumbers(listNode1, listNode2);
        assertNotNull(listNodeResult);
        assertEquals(2, listNodeResult.val);
        assertNull(listNodeResult.next);
    }

    @Order(4)
    @DisplayName("simple case 4")
    @Test
    void case3() {
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(5);

        ListNode listNodeResult = app.addTwoNumbers(listNode1, listNode2);
        assertNotNull(listNodeResult);
        assertEquals(0, listNodeResult.val);
        assertEquals(1, listNodeResult.next.val);
        assertNull(listNodeResult.next.next);
    }

    @Order(5)
    @DisplayName("simple case 5")
    @Test
    void case4() {
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(6);

        ListNode listNodeResult = app.addTwoNumbers(listNode1, listNode2);
        assertNotNull(listNodeResult);
        assertEquals(1, listNodeResult.val);
        assertEquals(1, listNodeResult.next.val);
        assertNull(listNodeResult.next.next);
    }

    @Order(6)
    @DisplayName("simple case 6")
    @Test
    void case5() {
        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(9);

        ListNode listNodeResult = app.addTwoNumbers(listNode1, listNode2);
        assertNotNull(listNodeResult);
        assertEquals(8, listNodeResult.val);
        assertEquals(1, listNodeResult.next.val);
        assertNull(listNodeResult.next.next);
    }

    @Order(7)
    @DisplayName("simple case 7")
    @Test
    void case6() {
        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(0);
        listNode2.next =  new ListNode(1);

        ListNode listNodeResult = app.addTwoNumbers(listNode1, listNode2);
        assertNotNull(listNodeResult);
        assertEquals(9, listNodeResult.val);
        assertEquals(1, listNodeResult.next.val);
        assertNull(listNodeResult.next.next);
    }

    @Order(8)
    @DisplayName("simple case 8")
    @Test
    void case7() {
        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(1);
        listNode2.next =  new ListNode(1);

        ListNode listNodeResult = app.addTwoNumbers(listNode1, listNode2);
        assertNotNull(listNodeResult);
        assertEquals(0, listNodeResult.val);
        assertEquals(2, listNodeResult.next.val);
        assertNull(listNodeResult.next.next);
    }

    @Order(8)
    @DisplayName("simple case 8")
    @Test
    void case8() {
        ListNode listNode1 = new ListNode(2);
        listNode1.next =  new ListNode(4);
        listNode1.next.next =  new ListNode(3);

        ListNode listNode2 = new ListNode(5);
        listNode2.next =  new ListNode(6);
        listNode2.next.next =  new ListNode(4);

        ListNode listNodeResult = app.addTwoNumbers(listNode1, listNode2);
        assertNotNull(listNodeResult);
        assertEquals(7, listNodeResult.val);
        assertEquals(0, listNodeResult.next.val);
        assertEquals(8, listNodeResult.next.next.val);
        assertNull(listNodeResult.next.next.next);
    }

}


