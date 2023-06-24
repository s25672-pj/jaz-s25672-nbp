package com.example.jazs25672nbp.controller;


import com.example.jazs25672nbp.model.CurrencyRate;
import com.example.jazs25672nbp.service.CurrencyService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService){
        this.currencyService = currencyService;
    }


    @ApiResponses(value = {
            @ApiResponse(responseCode = "400" , description = "Podano błędny kod waluty"),
            @ApiResponse(responseCode = "404", description = "Nie znaleziono danych"),
            @ApiResponse(responseCode = "500", description = "Błąd serwera NBP")
    })
    @GetMapping("/{currency}/{startDate}/{endDate}")
    public ResponseEntity<CurrencyRate> getCurrencyRate(@PathVariable("currency") String currency, @PathVariable("startDate")LocalDate startDate, @PathVariable("endDate")LocalDate endDate){
        return  null;
    }

}
