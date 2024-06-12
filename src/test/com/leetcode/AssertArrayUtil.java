package com.leetcode;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertArrayUtil {

    public static void assertArrayEquals(int []expected, int []actual) {
        assertEquals(expected.length, actual.length);
        for(int i=0; i<expected.length; i++ ) {
            assertEquals(expected[i], actual[i]);
        }
    }


}
