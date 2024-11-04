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
}