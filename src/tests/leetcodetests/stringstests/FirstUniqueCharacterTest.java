package tests.leetcodetests.stringstests;

import leetcode.strings.FirstUniqueCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterTest {

    @Test
    public void shouldReturnIndexNumberTwoForFirstUniqueCharacter() {
        String result = "loveleetcode";
        int expected = 2;
        assertEquals(expected, FirstUniqueCharacter.firstUniqueCharIndex(result));
    }

    @Test
    public void shouldReturnIndexNumberFiveForFirstUniqueCharacter() {
        String result = "loelevetcode";
        int expected = 5;
        assertEquals(expected, FirstUniqueCharacter.firstUniqueCharIndex(result));
    }

    @Test
    public void shouldReturnMinusOneIfUniqueCharacterDoesNotExist() {
        String result = "aabb";
        int expected = -1;
        assertEquals(expected, FirstUniqueCharacter.firstUniqueCharIndex(result));
    }

    @Test
    public void shouldReturnMinusOneIfArgumentNull() {
        String result = null;
        int expected = -1;
        assertEquals(expected, FirstUniqueCharacter.firstUniqueCharIndex(result));
    }

    @Test
    public void shouldReturnMinusOneIfArgumentIsEmpty() {
        String result = "";
        int expected = -1;
        assertEquals(expected, FirstUniqueCharacter.firstUniqueCharIndex(result));
    }

}