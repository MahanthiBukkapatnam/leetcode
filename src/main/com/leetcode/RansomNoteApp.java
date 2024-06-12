package com.leetcode;

import java.util.stream.IntStream;

public class RansomNoteApp {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] rnArray = createUniCodeCountArray(ransomNote);
        //printArray(rnArray);

        int[] mgCharArray = createUniCodeCountArray(magazine);
        //printArray(mgCharArray);

        for(int i=0; i<rnArray.length; i++) {
            if(rnArray[i] > 0 && mgCharArray[i] < rnArray[i]) {
                return false;
            }
        }

        //printArray(rnArray);

        return true;
    }

    public int[] createUniCodeCountArray(String contents) {
        int [] array = new int[26];

        char[] contentsCharArray = contents.toCharArray();
        for(int i=0; i<contentsCharArray.length; i++) {
            char c = contentsCharArray[i];
            int index = c - 'a';
            array[index]++;
        }

        return array;
    }

}
