package com.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int i) {
        String value = Integer.valueOf(i).toString();
        String reverseValue = reverse(value);
        return value.equals(reverseValue);
    }

    public String reverse(String value) {
        String valueStr = "" + value;
        char [] revChars = new char[valueStr.length()];

        int j=valueStr.length()-1;
        for(int i=0; i<=valueStr.length()-1; i++) {
            revChars[j] = valueStr.charAt(i);
            j--;
        }

        return new String(revChars);
    }
}
