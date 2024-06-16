package com.leetcode.bestimetobuyandsellstock;

import com.leetcode.AssertArrayUtil;
import com.leetcode.rotatearray.RotateArray;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test for com.leetcode.bestimetobuyandsellstock.BestTimeToBuyAndSellStock
 *
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
 *
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock app = new BestTimeToBuyAndSellStock();

    @Nested
    class BoundaryCases {
        @Order(0)
        @Test
        void case0() {
            int[] prices = {};
            int profit = app.maxProfit(prices);
            assertEquals(0, profit);
        }
    }

    @Nested
    class SupportMethodsTest {
        @Order(0)
        @DisplayName("")
        @Test
        void case0() {
            int[] prices = {7,1,5,3,6,4};
            MinMaxData minMaxData = app.findMinMaxData(prices,0,5);
            assertEquals(1, minMaxData.getMinValue());
            assertEquals(1, minMaxData.getMinValueIndex());
            assertEquals(7, minMaxData.getMaxValue());
            assertEquals(0, minMaxData.getMaxValueIndex());
        }
    }

    @Nested
    class Case1 {
        @Order(0)
        @DisplayName("")
        @Test
        void case0() {
            int[] prices = {1,5,3,6,4};
            int profit = app.maxProfit(prices);
            assertEquals(5, profit);
        }

        @Order(1)
        @DisplayName("LeetCode Case")
        @Test
        void case1() {
            int[] prices = {1,2};
            int profit = app.maxProfit(prices);
            assertEquals(1, profit);
        }
    }

    @Nested
    class Case2 {
        @Order(0)
        @DisplayName("")
        @Test
        void case0() {
            int[] prices = {7,1,5,3,6,4};
            int profit = app.maxProfit(prices);
            assertEquals(5, profit);
        }

        @Order(2)
        @DisplayName("LeetCode Case 2")
        @Test
        void case2() {
            int[] prices = {7,2,4,1};
            int profit = app.maxProfit(prices);
            assertEquals(2, profit);
        }

        @Order(3)
        @DisplayName("LeetCode Case 3")
        @Test
        void case3() {
            int[] prices = new int[ 30000 ];
            for(int i=30000, j=0; i>0; i--,j++) {
                prices[j] = i;
            }

            int profit = app.maxProfit(prices);
            assertEquals(0, profit);
        }

        @Order(4)
        @DisplayName("LeetCode Case 4")
        @Test
        void case4() {
            int[] prices = {5,7,2,7,3,3,5,3,0};
            int profit = app.maxProfit(prices);
            assertEquals(5, profit);
        }

    }

}