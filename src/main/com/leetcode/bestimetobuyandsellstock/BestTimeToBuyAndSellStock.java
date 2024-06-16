package com.leetcode.bestimetobuyandsellstock;

import java.lang.management.MemoryNotificationInfo;

public class BestTimeToBuyAndSellStock {


    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        return maxProfit(prices, 0, prices.length-1);
    }


    public int maxProfit(int[] prices, int startIndex, int endIndex) {

        if(startIndex >= endIndex) {
            return 0;
        }

        if(!solutionExists(prices,startIndex,endIndex) ) {
            return 0;
        }

        MinMaxData minMaxData = findMinMaxData(prices,startIndex,endIndex);
        if(minMaxData.getMaxValueIndex()==startIndex && minMaxData.getMinValueIndex()==endIndex) {
            return maxProfit(prices,startIndex+1, endIndex-1);
        }

        if(minMaxData.getMaxValueIndex() > minMaxData.getMinValueIndex() ) {
            return minMaxData.getMaxValue() - minMaxData.getMinValue();
        }

        int profit1 = maxProfit(prices,startIndex,minMaxData.getMaxValueIndex());
        int profit2 = maxProfit(prices,minMaxData.getMaxValueIndex()+1, endIndex);

        if(profit1 >= profit2) {
            return profit1;
        }
        return profit2;
    }

    public boolean solutionExists(int[] prices, int startIndex, int endIndex) {
        boolean solutionExists = false;
        int prevValue = prices[startIndex];
        for(int i=startIndex+1; i<=endIndex; i++) {
            if(prices[i] > prevValue) {
                solutionExists = true;
                return true;
            }
            prevValue = prices[i];
        }

        return false;
    }

    public MinMaxData findMinMaxData(int[] prices, int startIndex, int endIndex) {
        MinMaxData minMaxData = new MinMaxData();

        minMaxData.setMaxValue(prices[startIndex]);
        minMaxData.setMaxValueIndex(startIndex);
        minMaxData.setMinValue(prices[startIndex]);
        minMaxData.setMinValueIndex(startIndex);

        for(int i=startIndex; i<= endIndex; i++) {
            if( prices[i] < minMaxData.getMinValue() ) {
                minMaxData.setMinValue(prices[i]);
                minMaxData.setMinValueIndex(i);
            }
            if( prices[i] > minMaxData.getMaxValue() ) {
                minMaxData.setMaxValue(prices[i]);
                minMaxData.setMaxValueIndex(i);
            }
        }

        return minMaxData;
    }
}

class MinMaxData {
    private int minValue;
    private int minValueIndex;
    private int maxValue;
    private int maxValueIndex;

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMinValueIndex() {
        return minValueIndex;
    }

    public void setMinValueIndex(int minValueIndex) {
        this.minValueIndex = minValueIndex;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMaxValueIndex() {
        return maxValueIndex;
    }

    public void setMaxValueIndex(int maxValueIndex) {
        this.maxValueIndex = maxValueIndex;
    }
}

