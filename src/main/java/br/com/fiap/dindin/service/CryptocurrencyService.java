package br.com.fiap.dindin.service;

import br.com.fiap.dindin.model.Cryptocurrency;
import java.util.List;

public interface CryptocurrencyService {
    List<Cryptocurrency> getAllCryptocurrencies();
    Cryptocurrency saveCryptocurrency(Cryptocurrency cryptocurrency);
    Cryptocurrency getCryptocurrencyById(Long id);
    Cryptocurrency updateCryptocurrency(Long id, Cryptocurrency cryptocurrency);
    void deleteCryptocurrency(Long id);
    List<Cryptocurrency> findCryptocurrenciesByName(String name);
    List<Cryptocurrency> getTopCryptocurrenciesByMarketCap(int limit);
    boolean existsBySymbol(String symbol);
    List<Cryptocurrency> saveAllCryptocurrencies(List<Cryptocurrency> cryptocurrencies);
}