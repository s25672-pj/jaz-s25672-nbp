package com.example.jazs25672nbp.Exceptions;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ServiceExceptionHandler {
    @ExceptionHandler(value = {CurrencyException.class})
    public ResponseEntity<Void> notFound(){
        return ResponseEntity.notFound().build();
    }
}
