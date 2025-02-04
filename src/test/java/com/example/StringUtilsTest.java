package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilsTest {
    @BeforeAll
    static void setUpOnce(){
        System.out.println("Starting all tests");
    }

    @BeforeEach
    void setup() {
        System.out.println("Running a new test...");
    }

    @Test
    @DisplayName("Test normal string reversal")
    void testReverse_NormalString() {
        assertEquals("dcba", StringUtils.reverseString("abcd"));
    }

    @Test
    @DisplayName("Test empty string")
    void testReverse_EmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    @DisplayName("Test single character string")
    void testReverse_SingleCharacter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    @DisplayName("Test palindrome string")
    void testReverse_Palindrome() {
        assertEquals("racecar", StringUtils.reverseString("racecar"));
    }

    @Test
    @DisplayName("Test string with spaces and special characters")
    void testReverse_StringWithSpaces() {
        assertEquals("!dlroW ,olleH", StringUtils.reverseString("Hello, World!"));
    }

    @Test
    @DisplayName("Test null input")
    void testReverse_NullInput() {
        assertNull(StringUtils.reverseString(null));
    }

    @AfterEach
    void teardown() {
        System.out.println("Test completed.");
    }

    @AfterAll
    static void cleanupOnce() {
        System.out.println("All tests finished.");
    }
}
