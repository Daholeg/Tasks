package tests.codewarstests;

import codewars.DetectPangram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectPangramTest {

    @Test
    public void shouldReturnTrue(){
        assertEquals(true, DetectPangram.check("The quick brown fox jumps over the lazy dog."));
    }

    @Test
    public void shouldReturnFalse(){
        assertEquals(false, DetectPangram.check("You shall not pass!"));
    }
}