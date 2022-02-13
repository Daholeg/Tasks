package tests.leetcodetests.arraystests;

import leetcode.arrays.MaxOfConsecutiveOnes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxOfConsecutiveOnesTest {

    @Test
    public void shouldReturnTwoOfConsecutiveNumberOne(){
        int[] array = new int[]{1,0,1,1,0,1};
        int expected = 2;
        assertEquals(expected, MaxOfConsecutiveOnes.findMaxConsecutiveOnes(array));
    }

    @Test
    public void shouldReturnOneOfConsecutiveNumberOne(){
        int[] array = new int[]{1,0,1,0,1};
        int expected = 1;
        assertEquals(expected, MaxOfConsecutiveOnes.findMaxConsecutiveOnes(array));
    }

    @Test
    public void shouldReturnZeroOfConsecutiveNumberOne(){
        int[] array = new int[]{0};
        int expected = 0;
        assertEquals(expected, MaxOfConsecutiveOnes.findMaxConsecutiveOnes(array));
    }
}