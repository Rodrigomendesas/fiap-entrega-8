package br.com.fiap.dindin.service;

import br.com.fiap.dindin.model.FinancialGoal;
import br.com.fiap.dindin.repository.FinancialGoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialGoalServiceImpl implements FinancialGoalService {

    private final FinancialGoalRepository financialGoalRepository;

    @Autowired
    public FinancialGoalServiceImpl(FinancialGoalRepository financialGoalRepository) {
        this.financialGoalRepository = financialGoalRepository;
    }

    @Override
    public List<FinancialGoal> getAllGoals() {
        return financialGoalRepository.findAll();
    }

    @Override
    public FinancialGoal saveGoal(FinancialGoal goal) {
        return financialGoalRepository.save(goal);
    }
}
