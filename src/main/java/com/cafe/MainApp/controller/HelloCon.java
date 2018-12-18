package com.cafe.MainApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloCon {
	@RequestMapping("/hello")    
    public String index() { 
        return "Hello World";
    }

}
