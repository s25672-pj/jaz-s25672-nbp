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

    public Root getCurrency(String currency, String startDate, String endDate) {
        return restTemplate.getForObject("https://api.nbp.pl/api/exchangerates/rates/a/{currency}/{startDate}/{endDate}/?format=json", Root.class, currency, startDate, endDate);
    }


}
