package com.vyasmeet.springmicroservices.currencyexchangeservice.repository;

import com.vyasmeet.springmicroservices.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}
