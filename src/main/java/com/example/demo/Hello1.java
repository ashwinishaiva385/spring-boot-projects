package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

class Hello
{   @RequestMapping("/")
    public  String greet()
    {
        return "Hello world,I am Ash";
    }
}