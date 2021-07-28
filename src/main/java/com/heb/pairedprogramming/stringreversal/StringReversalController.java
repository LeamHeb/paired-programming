package com.heb.pairedprogramming.stringreversal;

import com.heb.pairedprogramming.stringreversal.dto.StringReversalResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/string/")
public class StringReversalController {

    @Autowired
    StringReversalService service;

    @GetMapping(value = "reverse/{string}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createPrice(@PathVariable String string){
        StringReversalResult result = new StringReversalResult();
        try {
            String reverseString = service.reverseString(string);
            result.setReversedValue(reverseString);
            result.setOriginalValue(string);
        } catch(Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
