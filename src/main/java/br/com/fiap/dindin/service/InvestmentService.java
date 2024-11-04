package br.com.fiap.dindin.service;

import br.com.fiap.dindin.model.Investment;
import java.util.List;

public interface InvestmentService {
    List<Investment> getAllInvestments();
    Investment saveInvestment(Investment investment);
}
