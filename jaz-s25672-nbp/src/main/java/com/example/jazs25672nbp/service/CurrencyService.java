package com.example.jazs25672nbp.service;


import com.example.jazs25672nbp.repository.CurrencyRepository;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CurrencyService {

    private final RestTemplate restTemplate;

    private final CurrencyRepository currencyRepository;



    public CurrencyService(RestTemplate restTemplate, CurrencyRepository currencyRepository){
        this.restTemplate = restTemplate;
        this.currencyRepository = currencyRepository;
    }

    private static final String NBPurl = "http://api.nbp.pl/api/exchangerates/rates";


}
