package tests.leetcodetests.arraystests;

import leetcode.arrays.PlusOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    public void shouldIncrementArrayByOnyAndReturn100(){
        int[] result = new int[]{9,9};
        int[] expected = new int[]{1,0,0};
        assertArrayEquals(expected, PlusOne.plusOne(result));
    }

    @Test
    public void shouldIncrementArrayByOnyAndReturn124(){
        int[] result = new int[]{1,2,3};
        int[] expected = new int[]{1,2,4};
        assertArrayEquals(expected, PlusOne.plusOne(result));
    }

    @Test
    public void shouldIncrementArrayByOnyAndReturn10(){
        int[] result = new int[]{9};
        int[] expected = new int[]{1,0};
        assertArrayEquals(expected, PlusOne.plusOne(result));
    }

    @Test
    public void shouldIncrementArrayByOnyAndReturn1(){
        int[] result = new int[]{0};
        int[] expected = new int[]{1};
        assertArrayEquals(expected, PlusOne.plusOne(result));
    }
}