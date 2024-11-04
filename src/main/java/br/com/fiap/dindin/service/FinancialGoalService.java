package br.com.fiap.dindin.service;

import br.com.fiap.dindin.model.FinancialGoal;
import java.util.List;

public interface FinancialGoalService {
    List<FinancialGoal> getAllGoals();
    FinancialGoal saveGoal(FinancialGoal goal);
}
