package com.heb.pairedprogramming.stringreversal;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(MockitoJUnitRunner.class)
class StringReversalServiceTest {

    private StringReversalService service;

    @BeforeEach
    void setup() {
        service = new StringReversalService();
    }

    @Test
    public void checkReversalFunction() throws Exception {
        String expectedString = "dca";
        String string = "acd";
        String reversedString = service.reverseString(string);

        assertEquals(expectedString, reversedString);
    }

    @Test(expected = Exception.class)
    public void checkForBannedLetterH() throws Exception {
        String stringH = "H";

        String string = service.reverseString(stringH);
    }

    @Test(expected = Exception.class)
    public void checkForBannedLetterE() throws Exception {
        String stringE = "E";

        String string = service.reverseString(stringE);
    }

    @Test(expected = Exception.class)
    public void checkForBannedLetterB() throws Exception {
        String stringB = "B";

        String string = service.reverseString(stringB);
    }
}
