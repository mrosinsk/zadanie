package com.zadanie.MiniProjekcik;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/api/hello")
    public Greeting hello(){
    Greeting greeting = new Greeting();
    greeting.setMsg("hello world!");
    return greeting;
    }
}
