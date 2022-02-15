package tests.codewarstests;

import codewars.SumOfNthSeries;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNthSeriesTest {

    @Test
    public void test1() {
        assertEquals("1,57", SumOfNthSeries.seriesSum(5));
    }
    @Test
    public void test2() {
        assertEquals("1,77", SumOfNthSeries.seriesSum(9));
    }
    @Test
    public void test3() {
        assertEquals("1,94", SumOfNthSeries.seriesSum(15));
    }
}