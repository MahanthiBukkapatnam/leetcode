package com.leetcode;

import com.leetcode.RansomNoteApp;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for Ransom Note
 *
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RansomNoteAppTest {
    RansomNoteApp app = new RansomNoteApp();

    @Nested
    class CountArrayCases {

        @Order(1)
        @DisplayName("simple case for failure")
        @Test
        void case1() {
            int[] actualArray = app.createUniCodeCountArray("a");
            assertNotNull(actualArray);
            assertEquals(26, actualArray.length);
            assertEquals(1, actualArray['a'-'a']);
            for(int i=1; i<26; i++) {
                assertEquals(0, actualArray[i]);
            }
        }

        @Order(1)
        @DisplayName("simple case for failure")
        @Test
        void case2() {
            int[] actualArray = app.createUniCodeCountArray("acegi");
            assertNotNull(actualArray);
            assertEquals(26, actualArray.length);

            assertEquals(1, actualArray['a'-'a']);
            assertEquals(0, actualArray['b'-'a']);

            assertEquals(1, actualArray['c'-'a']);
            assertEquals(0, actualArray['d'-'a']);

            assertEquals(1, actualArray['e'-'a']);
            assertEquals(0, actualArray['f'-'a']);

            assertEquals(1, actualArray['g'-'a']);
            assertEquals(0, actualArray['h'-'a']);

            assertEquals(1, actualArray['i'-'a']);

            for(int i=9; i<26; i++) {
                assertEquals(0, actualArray[i]);
            }
        }

    }

        @Nested
    class FailureCases {

        @Order(1)
        @DisplayName("simple case for failure")
        @Test
        void case1() {
            assertFalse(app.canConstruct("a","b"));
        }

        @Order(2)
        @DisplayName("simple case for failure")
        @Test
        void case2() {
            assertFalse(app.canConstruct("a","bc") );
        }

        @Order(3)
        @DisplayName("simple case for success")
        @Test
        void case3() {
            assertFalse(app.canConstruct("aa","a") );
        }
    }

    @Nested
    class SuccessCases {
        @Order(1)
        @DisplayName("simple case for success")
        @Test
        void case0() {
            assertTrue(app.canConstruct("a","a"));
        }

        @Order(2)
        @DisplayName("simple case for success")
        @Test
        void case1() {
            assertTrue(app.canConstruct("a","ab"));
        }

        @Order(3)
        @DisplayName("simple case for success")
        @Test
        void case3() {
            assertTrue(app.canConstruct("ac","abc") );
        }

        @Order(3)
        @DisplayName("simple case for success")
        @Test
        void case4() {
            assertTrue(app.canConstruct("aac","aabc") );
        }
    }

    @Nested
    class LeetCodeCases {

        @Order(1)
        @DisplayName("simple case for failure")
        @Test
        void case1() {
            assertTrue(app.canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
        }
    }

}


