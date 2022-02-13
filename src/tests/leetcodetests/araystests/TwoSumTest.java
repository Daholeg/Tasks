package tests.leetcodetests.araystests;

import leetcode.arrays.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    public void shouldReturnIndicesOfTheTwoNumbersThatGivesASumEqualsTargetVersion1(){
        int[] result = new int[]{2,5,5,11};
        int target = 10;
        int[] expected = new int[]{1,2};
        assertArrayEquals(expected, TwoSum.getTwoIndices(result, target));
    }

    @Test
    public void shouldReturnIndicesOfTheTwoNumbersThatGivesASumEqualsTargetVersion2(){
        int[] result = new int[]{2,7,11,5};
        int target = 9;
        int[] expected = new int[]{0,1};
        assertArrayEquals(expected, TwoSum.getTwoIndices(result, target));
    }

    @Test
    public void shouldReturnNothing(){
        int[] result = new int[]{2,7,11,5};
        int target = 20;
        int[] expected = new int[]{};
        assertArrayEquals(expected, TwoSum.getTwoIndices(result, target));
    }

}