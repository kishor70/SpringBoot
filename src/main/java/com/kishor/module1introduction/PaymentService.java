package com.kishor.module1introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class PaymentService {

    public void pay(){
        System.out.println("Paying.......");
    }

    @PostConstruct
    public void afterInitiate(){
        System.out.println("Before paying.....");
    }
    @PreDestroy
    public void beforeDestroy() {
        System.out.println("After payment is done.....");
    }
}
