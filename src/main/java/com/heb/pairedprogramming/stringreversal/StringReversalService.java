package com.heb.pairedprogramming.stringreversal;

import org.springframework.stereotype.Service;

@Service
public class StringReversalService {

    public String reverseString(String string) throws Exception {

        validateString(string);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(string);

        String reversedString = stringBuilder.reverse().toString();

        return reversedString;
    }

    private void validateString(String string) throws Exception {
        if (string.contains("H") || string.contains("E") || string.contains("B")) {
            throw new Exception("String contains banned letters");
        }
    }
}
