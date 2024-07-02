package com.leetcode;

public class AddBinary67 {

    public String addBinary(String a, String b) {

        int aLength = a.length();
        int bLength = b.length();

        if(aLength<bLength) {
            return add(a,b);
        }
        return add(b,a);
    }

    int getValue(char val) {
        if(val == '0') {
            return 0;
        }
        return 1;
    }
    String add(String shortString, String longString) {
        StringBuilder toReturn = new StringBuilder();
        int j=longString.length()-1;
        int carry=0;
        for(int i=shortString.length()-1; i>=0; i--) {
            int valA = getValue( shortString.charAt(i) );
            int valB = getValue( longString.charAt(j) );
            int sum = valA + valB + carry;
            if ( sum == 0) {
                carry = 0;
                toReturn.append("0");
            }
            else if( sum == 1 ){
                carry = 0;
                toReturn.append("1");
            }
            else if( sum == 2 ){
                carry = 1;
                toReturn.append("0");
            }
            else if( sum == 3 ){
                carry = 1;
                toReturn.append("1");
            }
            j--;
        }

        for( ; j>=0; j--) {
            int valB = getValue( longString.charAt(j) );
            int sum = valB + carry;
            if ( sum == 0) {
                carry = 0;
                toReturn.append("0");
            }
            else if( sum == 1 ){
                carry = 0;
                toReturn.append("1");
            }
            else if( sum == 2 ){
                carry = 1;
                toReturn.append("0");
            }
            else if( sum == 3 ){
                carry = 1;
                toReturn.append("1");
            }
        }

        if(carry>0) {
            toReturn.append("1");
        }

        StringBuilder rev = new StringBuilder();
        for(int i=toReturn.length()-1; i>=0; i--) {
            rev.append( toReturn.charAt(i) );
        }
        return rev.toString();
    }
}
