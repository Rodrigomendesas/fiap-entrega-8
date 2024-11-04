package br.com.fiap.dindin.model;

import java.time.LocalDate;

public class Investment {
    private Long id;
    private String investmentType;
    private double amount;
    private LocalDate date;

    public Investment() {
    }

    public Investment(Long id, String investmentType, double amount, LocalDate date) {
        this.id = id;
        this.investmentType = investmentType;
        this.amount = amount;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvestmentType() {
        return investmentType;
    }

    public void setInvestmentType(String investmentType) {
        this.investmentType = investmentType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
