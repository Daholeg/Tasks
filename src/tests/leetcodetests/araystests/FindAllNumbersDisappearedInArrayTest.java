package tests.leetcodetests.araystests;

import leetcode.arrays.FindAllNumbersDisappearedInArray;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllNumbersDisappearedInArrayTest {

    @Test
    public void shouldReturnAllNumbersDisappearedInArray (){
        int[] result = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(6);
        assertEquals(expected, FindAllNumbersDisappearedInArray.findDisappearedNumbers(result));
    }

    @Test
    public void shouldReturnDisappearedIntegerSix (){
        int[] result = new int[]{4,3,2,7,8,2,1,5};
        List<Integer> expected = new ArrayList<>();
        expected.add(6);
        assertEquals(expected, FindAllNumbersDisappearedInArray.findDisappearedNumbers(result));
    }

    @Test
    public void shouldReturnDisappearedIntegerFive (){
        int[] result = new int[]{4,3,2,7,8,2,1,6};
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        assertEquals(expected, FindAllNumbersDisappearedInArray.findDisappearedNumbers(result));
    }

}