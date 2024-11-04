package br.com.fiap.dindin.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "Welcome to Dindin!";
}}
