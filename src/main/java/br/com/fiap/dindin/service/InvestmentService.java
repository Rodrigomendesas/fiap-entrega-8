package br.com.fiap.dindin.service;

import br.com.fiap.dindin.model.Investment;
import java.util.List;

public interface InvestmentService {
    List<Investment> getAllInvestments();
    Investment saveInvestment(Investment investment);
    Investment getInvestmentById(Long id);
    Investment updateInvestment(Long id, Investment investment);
    void deleteInvestment(Long id);
    List<Investment> findInvestmentsByType(String type);
    List<Investment> getInvestmentsByDateRange(LocalDate startDate, LocalDate endDate);
    boolean existsById(Long id);
    List<Investment> saveAllInvestments(List<Investment> investments);
    double calculateTotalInvestmentValue();
}
