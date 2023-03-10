package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController{

    @Value("${myCustomProps.devName}")
    private String devName;

    @Value("${myCustomProps.authCode}")
    private String authCode;
    @GetMapping("")
    public ResponseEntity<String> getProperty(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello "+ devName+" your authCode is "+authCode);
    }

}