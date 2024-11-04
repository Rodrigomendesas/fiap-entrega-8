package br.com.fiap.dindin.service;

import br.com.fiap.dindin.model.Cryptocurrency;
import br.com.fiap.dindin.repository.CryptocurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CryptocurrencyServiceImpl implements CryptocurrencyService {

    private final CryptocurrencyRepository cryptocurrencyRepository;

    @Autowired
    public CryptocurrencyServiceImpl(CryptocurrencyRepository cryptocurrencyRepository) {
        this.cryptocurrencyRepository = cryptocurrencyRepository;
    }

    @Override
    public List<Cryptocurrency> getAllCryptocurrencies() {
        return cryptocurrencyRepository.findAll();
    }

    @Override
    public Cryptocurrency saveCryptocurrency(Cryptocurrency cryptocurrency) {
        return cryptocurrencyRepository.save(cryptocurrency);
    }

    @Override
    public Cryptocurrency getCryptocurrencyById(Long id) {
        return null;
    }

    @Override
    public Cryptocurrency updateCryptocurrency(Long id, Cryptocurrency cryptocurrency) {
        return null;
    }

    @Override
    public void deleteCryptocurrency(Long id) {

    }

    @Override
    public List<Cryptocurrency> findCryptocurrenciesByName(String name) {
        return List.of();
    }

    @Override
    public List<Cryptocurrency> getTopCryptocurrenciesByMarketCap(int limit) {
        return List.of();
    }

    @Override
    public boolean existsBySymbol(String symbol) {
        return false;
    }

    @Override
    public List<Cryptocurrency> saveAllCryptocurrencies(List<Cryptocurrency> cryptocurrencies) {
        return List.of();
    }
}
