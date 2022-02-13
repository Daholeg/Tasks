package tests.leetcodetests.arraystests;

import leetcode.arrays.GetSumOfTwoElements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetSumOfTwoElementsTest {

    @Test
    public void shouldReturnTrueIfIntegerIsSumOfTwoElementsOfArray(){
        int [] array = new int[]{2,3,5,7,7,13};
        int n = 12;
        assertTrue(GetSumOfTwoElements.getSumOfTwoElements(array, n));
    }

    @Test
    public void shouldReturnFalseIfIntegerIsNotSumOfTwoElementsOfArray(){
        int [] array = new int[]{2,3,5,7,7,13};
        int n = 1;
        assertFalse(GetSumOfTwoElements.getSumOfTwoElements(array, n));
    }
}