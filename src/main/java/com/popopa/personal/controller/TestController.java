package com.popopa.personal.controller;

import com.popopa.personal.model.Test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @RequestMapping("/data")
    public ResponseEntity<Test> hello(@ModelAttribute Test param) {
        return new ResponseEntity<>(param, HttpStatus.OK);
    }
}
