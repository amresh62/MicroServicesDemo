package com.kamjritztex.orders.orderservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping()
    public String getMethodName() {
        return "You are at Order Service";
    }
    
}
