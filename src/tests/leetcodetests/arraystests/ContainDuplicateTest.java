package tests.leetcodetests.arraystests;

import leetcode.arrays.ContainDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainDuplicateTest {

    @Test
    public void shouldReturnTrueIfArrayContainsDuplicate(){
        int[] result = new int[]{1,2,3,1};
        assertTrue(ContainDuplicate.containsDuplicate(result));
    }

    @Test
    public void shouldReturnFalseIfArrayWithoutDuplicate(){
        int[] result = new int[]{1,2,3};
        assertFalse(ContainDuplicate.containsDuplicate(result));
    }
}