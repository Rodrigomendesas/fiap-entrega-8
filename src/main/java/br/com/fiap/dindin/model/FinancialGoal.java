package br.com.fiap.dindin.model;

public class FinancialGoal {
    private Long id;
    private String description;
    private double targetAmount;
    private double currentAmount;

    public FinancialGoal() {
    }

    public FinancialGoal(Long id, String description, double targetAmount, double currentAmount) {
        this.id = id;
        this.description = description;
        this.targetAmount = targetAmount;
        this.currentAmount = currentAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(double targetAmount) {
        this.targetAmount = targetAmount;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }
}
