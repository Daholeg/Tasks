package tests.leetcodetests.stringstests;

import leetcode.strings.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    public void shouldReverseStringHello() {
        String result = "hello";
        String expected = "olleh";
        assertEquals(expected, ReverseString.reverseString(result));
    }

    @Test
    public void shouldReverseStringJava() {
        String result = "java";
        String expected = "avaj";
        assertEquals(expected, ReverseString.reverseString(result));
    }
}