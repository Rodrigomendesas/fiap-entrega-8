package br.com.fiap.dindin.controller;

import br.com.fiap.dindin.model.Cryptocurrency;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cryptocurrencies")
public class CryptocurrencyController {
    @GetMapping
    public List<Cryptocurrency> getAllCryptocurrencies() {
        // Logic to retrieve cryptocurrencies
        return new ArrayList<>();
}}