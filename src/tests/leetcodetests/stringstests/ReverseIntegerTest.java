package tests.leetcodetests.stringstests;

import leetcode.strings.ReverseInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    public void getReversedInteger() {
        int result = 123;
        int expected = 321;
        assertEquals(expected, ReverseInteger.reverse(result));
    }

    @Test
    public void getNegativeReversedInteger() {
        int result = -123;
        int expected = -321;
        assertEquals(expected, ReverseInteger.reverse(result));
    }

    @Test
    public void getAnotherReversedInteger() {
        int result = 12438;
        int expected = 83421;
        assertEquals(expected, ReverseInteger.reverse(result));
    }
}