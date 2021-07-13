package com.heb.pairedprogramming.stringreversal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StringReversalResult {
    private String originalValue;
    private String reversedValue;

    public StringReversalResult() {

    }

    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }

    public String getReversedValue() {
        return reversedValue;
    }

    public void setReversedValue(String reversedValue) {
        this.reversedValue = reversedValue;
    }
}
