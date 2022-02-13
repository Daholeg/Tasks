package tests.leetcodetests.araystests;

import leetcode.arrays.ReverseText;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTextTest {

    @Test
    public void shouldReverseWordsInText1(){
        String result = "Hello World";
        String expected = "World Hello";
        assertEquals(expected, ReverseText.getReversedString(result));
    }

    @Test
    public void shouldReverseWordsInText2(){
        String result = "Hi Everyone";
        String expected = "Everyone Hi";
        assertEquals(expected, ReverseText.getReversedString(result));
    }

    @Test
    public void shouldDoNothing(){
        String result = "HelloWorld";
        String expected = "HelloWorld";
        assertEquals(expected, ReverseText.getReversedString(result));
    }

}