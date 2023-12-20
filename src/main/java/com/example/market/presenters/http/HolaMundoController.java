package com.example.market.presenters.http;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say-hello")
public class HolaMundoController {
    @GetMapping("/hello")
    public String saludar() {
        return "Hello Baby!";
    }
}
