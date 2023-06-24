package com.example.jazs25672nbp.repository;

import com.example.jazs25672nbp.model.CurrencyRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<CurrencyRate, Long> {
}
