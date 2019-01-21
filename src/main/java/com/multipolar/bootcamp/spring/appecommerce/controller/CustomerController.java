/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Customer;
import com.multipolar.bootcamp.spring.appecommerce.repository.CustomerRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author acer
 */
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/")
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        customer = customerRepository.save(customer);
        return ResponseEntity.ok(customer);
    }   

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable String id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent()) {
            return ResponseEntity.ok(customerOptional.get());
        } else return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteById(@PathVariable("id") String id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent()) {
            customerRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else
            return ResponseEntity.noContent().build();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Customer> update(@PathVariable("id") String id, @RequestBody Customer customer) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent()) {
            customerOptional.get().setName(customer.getName());
            customerOptional.get().setPhone(customer.getPhone());
            Customer customerUpdate = customerRepository.save(customerOptional.get());
            return ResponseEntity.ok(customerUpdate);
        } else
            return ResponseEntity.noContent().build();
    }
}
