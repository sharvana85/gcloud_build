package org.sample.app2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

        @GetMapping("/greetings/{name}")
    private String getGreeting(@PathVariable String name){
        return "Welcome "+name;
    }

}
