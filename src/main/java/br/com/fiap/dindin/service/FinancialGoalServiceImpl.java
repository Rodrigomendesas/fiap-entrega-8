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

    @Override
    public FinancialGoal getGoalById(Long id) {
        return null;
    }

    @Override
    public FinancialGoal updateGoal(Long id, FinancialGoal goal) {
        return null;
    }

    @Override
    public void deleteGoal(Long id) {

    }

    @Override
    public List<FinancialGoal> findGoalsByDescription(String description) {
        return List.of();
    }

    @Override
    public List<FinancialGoal> getGoalsByTargetAmountRange(double minAmount, double maxAmount) {
        return List.of();
    }

    @Override
    public boolean existsByDescription(String description) {
        return false;
    }

    @Override
    public List<FinancialGoal> saveAllGoals(List<FinancialGoal> goals) {
        return List.of();
    }

    @Override
    public double calculateProgress(Long id) {
        return 0;
    }

    @Override
    public List<FinancialGoal> findAll() {
        return List.of();
    }

    @Override
    public FinancialGoal save(FinancialGoal meta) {
        return null;
    }
}
