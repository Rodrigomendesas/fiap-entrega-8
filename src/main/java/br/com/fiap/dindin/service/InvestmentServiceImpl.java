package br.com.fiap.dindin.service;

import br.com.fiap.dindin.model.Investment;
import br.com.fiap.dindin.repository.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentServiceImpl implements InvestmentService {

    private final InvestmentRepository investmentRepository;

    @Autowired
    public InvestmentServiceImpl(InvestmentRepository investmentRepository) {
        this.investmentRepository = investmentRepository;
    }

    @Override
    public List<Investment> getAllInvestments() {
        return investmentRepository.findAll();
    }

    @Override
    public Investment saveInvestment(Investment investment) {
        return investmentRepository.save(investment);
    }

    @Override
    public Investment getInvestmentById(Long id) {
        return null;
    }

    @Override
    public Investment updateInvestment(Long id, Investment investment) {
        return null;
    }

    @Override
    public void deleteInvestment(Long id) {

    }

    @Override
    public List<Investment> findInvestmentsByType(String type) {
        return List.of();
    }

    @Override
    public List<Investment> getInvestmentsByDateRange(LocalDate startDate, LocalDate endDate) {
        return List.of();
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public List<Investment> saveAllInvestments(List<Investment> investments) {
        return List.of();
    }

    @Override
    public double calculateTotalInvestmentValue() {
        return 0;
    }
}