package br.com.fiap.dindin.repository;

import br.com.fiap.dindin.model.FinancialGoal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinancialGoalRepository extends JpaRepository<FinancialGoal, Long> {
    List<FinancialGoal> findAll();

    FinancialGoal save(FinancialGoal goal);
}