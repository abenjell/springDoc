package com.perso.example.springdoc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("hello")
    public ResponseEntity<Map> hello(@RequestHeader Map<String, String> headers) {
        System.out.println(headers);
        return  new ResponseEntity(headers, HttpStatus.OK);
    }
}
