package tests.leetcodetests.stringstests;

import leetcode.strings.ValidPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    public void shouldReturnTrueIfPalindrome() {
        String result = "A man, a plan, a canal: Panama";
        assertTrue(ValidPalindrome.isPalindrome(result));
    }

    @Test
    public void shouldReturnFalseIfNotPalindrome() {
        String result = "race a car";
        assertFalse(ValidPalindrome.isPalindrome(result));
    }
}