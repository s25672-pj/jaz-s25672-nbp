package com.example.jazs25672nbp.model;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class CurrencyRate {

    @Id
    @GeneratedValue
    @Schema(description = "id")
    private Long Id;

    @Schema(description = "Waluta")
    private String currency;

    @Schema(description = "Kurs")
    private double rate;

    @Schema(description = "Data rozpoczynająca przedział")
    private LocalDate startDate;

    @Schema(description = "Data zamykająca przedział")
    private LocalDate endDate;

    @Schema(description = "Aktualna data wykoniania działania")
    private LocalDateTime dateTime;


    public CurrencyRate(String currency, double rate, LocalDate startDate, LocalDate endDate, LocalDateTime actualDate) {
        this.currency = currency;
        this.rate = rate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dateTime = actualDate;
    }

    public CurrencyRate(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate date) {
        this.startDate = date;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate timestamp) {
        this.endDate = timestamp;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}


