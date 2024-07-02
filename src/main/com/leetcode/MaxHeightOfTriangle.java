package com.leetcode;

public class MaxHeightOfTriangle {

    public int maxHeightOfTriangle(int red, int blue) {
        int total = red+blue;

        if(red <4 && blue < 4) {
            if(total==0 ) {
                return 0;
            }
            if(total==1) {
                return 1;
            }
            if(red==1 && blue==1) {
                return 1;
            }
            if(red==1 && blue==2) {
                return 2;
            }
            if(red==2 && blue==1) {
                return 2;
            }
            if(red==2 && blue==2) {
                return 2;
            }
            if(red==2 && blue==3) {
                return 2;
            }
            if(red==3 && blue==2) {
                return 2;
            }
        }

        int min = 0;
        int max = 0;
        if(red < blue) {
            min = red;
            max = blue;
        }
        else {
            min = blue;
            max = red;
        }

        if(min==0) {
            if(max>=1) {
                return 1;
            }
            else {
                return 0;
            }
        }

        //Based on min... what is the level?
        int n = (int) Math.sqrt( 4*min) + 1;
        int evenTotal = getEvenCount(n);
        int oddTotal = getOddCount(n);
//        System.out.println("n=[" + n + "]");
//        System.out.println("even count=[" + getEvenCount(n) + "]");
//        System.out.println("odd count=[" + getOddCount(n) + "]");

        while( !conditionMeets(evenTotal,oddTotal,min, max) ) {
            n = n-1;
            evenTotal = getEvenCount(n);
            oddTotal = getOddCount(n);
        }

        return n;
    }

    boolean conditionMeets(int evenTotal, int oddTotal, int min, int max) {
        int minTotal = 0;
        int maxTotal = 0;
        if(evenTotal < oddTotal) {
            minTotal = evenTotal;
            maxTotal = oddTotal;
        }
        else {
            maxTotal = evenTotal;
            minTotal = oddTotal;
        }

        if(minTotal <= min && maxTotal <= max) {
            return true;
        }

        return false;
    }
    int getEvenCount(int n) {
        if(n<4) {
            if(n==1) {
                return 0;
            }
            if(n==2) {
                return 2;
            }
            if(n==3) {
                return 2;
            }
        }

        if(n%2==0) {
            return (int) ( (n * ( n+2)) / 4 );
        }
        else {
            int m=n-1;
            return (int) ( (m * ( m+2)) / 4 );
        }
    }

    int getOddCount(int n) {

        if(n<4) {
            if(n==1) {
                return 1;
            }
            if(n==2) {
                return 1;
            }
            if(n==3) {
                return 4;
            }
        }

        if(n%2==0) {
            int m= (n)/2;
            return m*m;
        }
        else {
            int m= (n+1)/2;
            return m*m;
        }

    }
}
