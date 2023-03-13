package com.spring.microservices.inaction.springmicroservicesinaction.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWOrldCOntroller {

    @GetMapping("/{firstName}")
    public String hrlloGet(@PathVariable String firstName,
                           @RequestParam String lastName) {

        return String.format("{\"message\": \"Hello %s %s\"}", firstName, lastName);
    }
}
