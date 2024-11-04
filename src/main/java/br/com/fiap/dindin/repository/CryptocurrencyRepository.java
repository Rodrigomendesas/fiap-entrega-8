package br.com.fiap.dindin.repository;

import br.com.fiap.dindin.model.Cryptocurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CryptocurrencyRepository extends JpaRepository<Cryptocurrency, Long> {
    List<Cryptocurrency> findAll();

    Cryptocurrency save(Cryptocurrency cryptocurrency);
}
