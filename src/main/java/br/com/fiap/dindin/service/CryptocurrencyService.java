package br.com.fiap.dindin.service;

import br.com.fiap.dindin.model.Cryptocurrency;
import java.util.List;

public interface CryptocurrencyService {
    List<Cryptocurrency> getAllCryptocurrencies();
    Cryptocurrency saveCryptocurrency(Cryptocurrency cryptocurrency);
    // Add other cryptocurrency-related methods
}