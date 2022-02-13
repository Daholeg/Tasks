package tests.leetcodetests.arraystests;

import leetcode.arrays.RotateArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    public void shouldRotateTheArrayToTheRightBy4Steps(){
        int[] result = new int[]{1,2,3,4,5,6,7,5,7};
        int step = 4;
        RotateArray.rotate(result,step);
        int[] expected = new int[]{6,7,5,7,1,2,3,4,5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldRotateTheArrayToTheRightBy1Steps(){
        int[] result = new int[]{1,2,3,4,5,6,7,5,7};
        int step = 1;
        RotateArray.rotate(result,step);
        int[] expected = new int[]{7,1,2,3,4,5,6,7,5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldDoNothing(){
        int[] result = new int[]{1,2,3,4,5,6,7,5,7};
        int step = 0;
        RotateArray.rotate(result,step);
        int[] expected = new int[]{1,2,3,4,5,6,7,5,7};
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldDoNothingWhenStepsIsNegative(){
        int[] result = new int[]{1,2,3,4,5,6,7,5,7};
        int step = -1;
        RotateArray.rotate(result,step);
        int[] expected = new int[]{1,2,3,4,5,6,7,5,7};
        assertArrayEquals(expected, result);
    }

}