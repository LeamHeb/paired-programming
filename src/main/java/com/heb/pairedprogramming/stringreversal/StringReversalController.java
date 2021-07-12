package com.heb.pairedprogramming.stringreversal;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/string/")
public class StringReversalController {

    @GetMapping(value = "reverse", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createPrice(){
        return null;
    }
}
