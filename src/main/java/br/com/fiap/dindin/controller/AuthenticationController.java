package br.com.fiap.dindin.controller;

import br.com.fiap.dindin.model.UserLoginRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {
    @PostMapping("/login")
    public String login(@RequestBody UserLoginRequest loginRequest) {
        return "Login successful";
}}
