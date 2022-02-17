package tests.codewarstests;

import codewars.NumberInExpandedForm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberInExpandedFormTest {

    @Test
    public void shouldReturnExpandedFormOfIntegerVersion1(){
        assertEquals("10 + 2", NumberInExpandedForm.getExtendedNum(12));
    }

    @Test
    public void shouldReturnExpandedFormOfIntegerVersion2(){
        assertEquals("70000 + 300 + 4", NumberInExpandedForm.getExtendedNum(70304));
    }

    @Test
    public void shouldReturnExpandedFormOfIntegerIfEndsOnZero(){
        assertEquals("90000 + 30", NumberInExpandedForm.getExtendedNum(90030));
    }
}