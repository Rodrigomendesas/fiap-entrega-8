package br.com.fiap.dindin.controller;

import br.com.fiap.dindin.model.Investment;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/investments")
public class InvestmentsController {
    public List<Investment> getAllInvestments() {
        return new ArrayList<>();
}}
