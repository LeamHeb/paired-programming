package com.heb.pairedprogramming.stringreversal;

import com.heb.pairedprogramming.stringreversal.dto.StringReversalResult;
import com.sun.jdi.request.InvalidRequestStateException;
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
    StringReversalService stringReversalService;

    @GetMapping(value = "reverse/{originalString}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createPrice(@PathVariable String originalString){

        if(originalString.contains("H") || originalString.contains("E") || originalString.contains("B")) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity(stringReversalService.reverse(originalString), HttpStatus.OK);
        }
    }
}
