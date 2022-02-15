package tests.leetcodetests.stringstests;

import leetcode.strings.ValidAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    public void shouldReturnTrueIfAnagram() {
        String result = "anagram";
        String expected = "nagaram";
        assertTrue(ValidAnagram.isAnagram(expected,result));
    }

    @Test
    public void shouldReturnFalseIfNotAnagram() {
        String result = "qwas";
        String expected = "zxer";
        assertFalse(ValidAnagram.isAnagram(expected,result));
    }
}