package br.com.fiap.dindin.service;

import br.com.fiap.dindin.model.FinancialGoal;
import java.util.List;

public interface FinancialGoalService {
    List<FinancialGoal> getAllGoals();
    FinancialGoal saveGoal(FinancialGoal goal);
    FinancialGoal getGoalById(Long id);
    FinancialGoal updateGoal(Long id, FinancialGoal goal);
    void deleteGoal(Long id);
    List<FinancialGoal> findGoalsByDescription(String description);
    List<FinancialGoal> getGoalsByTargetAmountRange(double minAmount, double maxAmount);
    boolean existsByDescription(String description);
    List<FinancialGoal> saveAllGoals(List<FinancialGoal> goals);
    double calculateProgress(Long id);

    List<FinancialGoal> findAll();

    FinancialGoal save(FinancialGoal meta);
}
