/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Transaction;
import com.multipolar.bootcamp.spring.appecommerce.services.TransactionService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author acer
 */

@RestController
@RequestMapping("api/shops")
public class TransactionController {
    
    @Autowired
    private TransactionService ser;
    
    @GetMapping("/")
    public Iterable<Transaction> findAll() {
        return ser.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Transaction> findById(@PathVariable("id") String id) {
        Optional<Transaction> transactionOptional = ser.findById(id);
        if (transactionOptional.isPresent())
            return ResponseEntity.ok(transactionOptional.get());
        else
            return ResponseEntity.noContent().build();
    }
    
    @PostMapping("buy")
    public ResponseEntity<Transaction> buy(
            @RequestBody Transaction transaction) {
        transaction = ser.buy(transaction);
        return ResponseEntity.ok(transaction);
    }
    
}
