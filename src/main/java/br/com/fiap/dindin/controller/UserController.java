package br.com.fiap.dindin.controller;

import br.com.fiap.dindin.model.User;
import br.com.fiap.dindin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return userService.findUserByUsername(user.getUsername());
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome to Dindin!";
    }
}
