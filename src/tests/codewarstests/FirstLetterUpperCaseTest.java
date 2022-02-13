package tests.codewarstests;

import codewars.FirstLetterUpperCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class FirstLetterUpperCaseTest {

    @Test
    public void firstLetterShouldBeInUpperCase(){
        Assertions.assertEquals("Hey Test", FirstLetterUpperCase.toUpperCase("hey test"));
    }

    @Test
    public void shouldReturnNullIfNullArg(){
        Assertions.assertNull(null, FirstLetterUpperCase.toUpperCase(null));
    }

    @Test
    public void shouldReturnNullIfEmptyArg(){
        Assertions.assertNull(null, FirstLetterUpperCase.toUpperCase(""));
    }
}