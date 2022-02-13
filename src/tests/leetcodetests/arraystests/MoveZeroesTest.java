package tests.leetcodetests.arraystests;

import leetcode.arrays.MoveZeroes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    public void shouldMoveAllZeroesToTheEnd(){
        int [] result = new int[]{1,0,0,2,3,5,0};
        int [] expected = new int[]{1,2,3,5,0,0,0};
        MoveZeroes.moveZeroes(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldMoveOneZeroToTheEnd(){
        int [] result = new int[]{1,0,2,3,5};
        int [] expected = new int[]{1,2,3,5,0};
        MoveZeroes.moveZeroes(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldDoNothing(){
        int [] result = new int[]{1,2,3,5};
        int [] expected = new int[]{1,2,3,5};
        MoveZeroes.moveZeroes(result);
        assertArrayEquals(expected, result);
    }

}