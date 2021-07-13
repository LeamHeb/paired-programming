package com.heb.pairedprogramming.stringreversal;

import com.heb.pairedprogramming.stringreversal.dto.StringReversalResult;
import org.springframework.stereotype.Service;

@Service
public class StringReversalService {
    public StringReversalResult reverse(String originalString) {
        StringBuilder stringBuilder = new StringBuilder(originalString);

        StringReversalResult stringReversalResult = new StringReversalResult();
        stringReversalResult.setReversedValue(stringBuilder.reverse().toString());
        stringReversalResult.setOriginalValue(originalString);

        return stringReversalResult;
    }
}
