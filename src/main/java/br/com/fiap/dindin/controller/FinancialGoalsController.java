package br.com.fiap.dindin.controller;

import br.com.fiap.dindin.model.FinancialGoal;
import br.com.fiap.dindin.service.FinancialGoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/financial-goals")
public class FinancialGoalsController {
    @GetMapping
    public List<FinancialGoal> getAllGoals() {
        // Logic to retrieve financial goals
        return new ArrayList<>();
    }
    @Autowired
    private FinancialGoalService service;

    @GetMapping
    public List<FinancialGoal> getAllMetas() {
        return service.findAll();
    }

    @PostMapping
    public FinancialGoal createGoal(@RequestBody FinancialGoal meta) {
        return service.save(meta);
    }
}
