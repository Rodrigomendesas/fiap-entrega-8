package br.com.fiap.dindin.model;


public class Cryptocurrency {
    private Long id;
    private String name;
    private String symbol;
    private double marketCap;

    public Cryptocurrency() {
    }

    public Cryptocurrency(Long id, String name, String symbol, double marketCap) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.marketCap = marketCap;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }
}