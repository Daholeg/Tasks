package tests.leetcodetests.araystests;

import leetcode.arrays.NumbersWithEvenNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersWithEvenNumberTest {

    @Test
    public void shouldReturnOneNumberWithEvenNumberOfDigits(){
        int[] result = new int[]{555,901,482,1771};
        int expected = 1;
        assertEquals(expected, NumbersWithEvenNumber.findEvenNumbers(result));
    }

    @Test
    public void shouldReturnThreeNumbersWithEvenNumberOfDigits(){
        int[] result = new int[]{556,90,482345,1772};
        int expected = 3;
        assertEquals(expected, NumbersWithEvenNumber.findEvenNumbers(result));
    }

    @Test
    public void shouldReturnZeroNumberWithEvenNumberOfDigits(){
        int[] result = new int[]{555,901,483,177};
        int expected = 0;
        assertEquals(expected, NumbersWithEvenNumber.findEvenNumbers(result));
    }
}