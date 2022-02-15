package tests.leetcodetests.stringstests;

import leetcode.strings.StringToInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    @Test
    public void shouldFind4193InString() {
        String result = "4193 with words";
        int expected = 4193;
        assertEquals(expected, StringToInteger.findInteger(result));
    }

    @Test
    public void shouldFind4587InString() {
        String result = "gdfgdf 4587gfgd gf";
        int expected = 4587;
        assertEquals(expected, StringToInteger.findInteger(result));
    }

    @Test
    public void shouldFindNegativeIntegerInString() {
        String result = "gdfgfdgdfg gdfg hfg ..hfg **ggfh  -456 hgfjhgj";
        int expected = -456;
        assertEquals(expected, StringToInteger.findInteger(result));
    }
}