package com.vibecoding.ai_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello,jdk 21!";
    }

    @GetMapping("/greet")
    public Map<String,Object> greet(@RequestParam(defaultValue = "World") String name){
        return Map.of(
                "message", "Hello, " + name + "!",
                "time", LocalDateTime.now().toString()
        );
    }
}
