/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Shop;
import com.multipolar.bootcamp.spring.appecommerce.repository.ShopRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@RequestMapping("/api/shop")
public class ShopController {

    @Autowired
    private ShopRepository shopRepository;

    @GetMapping("/")
    public Iterable<Shop> findAll() {
        return shopRepository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Shop> save(@RequestBody Shop shop) {
        shop = shopRepository.save(shop);
        return ResponseEntity.ok(shop);
    }   

    @GetMapping("/{id}")
    public ResponseEntity<Shop> findById(@PathVariable String id) {
        Optional<Shop> shopOptional = shopRepository.findById(id);
        if (shopOptional.isPresent()) {
            return ResponseEntity.ok(shopOptional.get());
        } else return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Shop> deleteById(@PathVariable("id") String id) {
        Optional<Shop> shopOptional = shopRepository.findById(id);
        if (shopOptional.isPresent()) {
            shopRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else
            return ResponseEntity.noContent().build();
    }
}
