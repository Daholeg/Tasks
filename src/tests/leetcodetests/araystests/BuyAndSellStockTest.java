package tests.leetcodetests.araystests;

import leetcode.arrays.BuyAndSellStock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyAndSellStockTest {

    @Test
    public void shouldReturnSevenLikeMaxProfit() {
        int expected = 7;
        int[] result = new int[]{7,1,5,3,6,4};
        assertEquals(expected, BuyAndSellStock.maxProfit(result));
    }

    @Test
    public void shouldReturnOneLikeMaxProfit() {
        int expected = 1;
        int[] result = new int[]{3,4};
        assertEquals(expected, BuyAndSellStock.maxProfit(result));
    }

    @Test
    public void shouldReturnMaxProfitSum() {
        int expected = 0;
        int[] result = new int[]{0};
        assertEquals(expected, BuyAndSellStock.maxProfit(result));
    }

}