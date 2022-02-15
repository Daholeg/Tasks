package tests.leetcodetests.stringstests;

import leetcode.strings.FindIndexInString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIndexInStringTest {

    @Test
    public void shouldReturnTwoIfNeedleFound(){
        String haystack = "hello";
        String needle = "ll";
        int expected = 2;
        assertEquals(expected, FindIndexInString.findFirstIndexInHaystack(haystack, needle));
    }

    @Test
    public void shouldReturnFourIfNeedleFound(){
        String haystack = "mississippi";
        String needle = "issip";
        int expected = 4;
        assertEquals(expected, FindIndexInString.findFirstIndexInHaystack(haystack, needle));
    }

    @Test
    public void shouldReturnMinusOneIfNeedleNotPartOfHaystack(){
        String haystack = "aaaaa";
        String needle = "bba";
        int expected = -1;
        assertEquals(expected, FindIndexInString.findFirstIndexInHaystack(haystack, needle));
    }

    @Test
    public void shouldReturnZeroIfNeedleAndHaystackIsEmpty(){
        String haystack = "";
        String needle = "";
        int expected = 0;
        assertEquals(expected, FindIndexInString.findFirstIndexInHaystack(haystack, needle));
    }

}