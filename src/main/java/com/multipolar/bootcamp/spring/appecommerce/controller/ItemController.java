/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Item;
import com.multipolar.bootcamp.spring.appecommerce.repository.ItemRepository;
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
@RequestMapping("/api/item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/")
    public Iterable<Item> findAll() {
        return itemRepository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Item> save(@RequestBody Item item) {
        item = itemRepository.save(item);
        return ResponseEntity.ok(item);
    }   

    @GetMapping("/{id}")
    public ResponseEntity<Item> findById(@PathVariable String id) {
        Optional<Item> itemOptional = itemRepository.findById(id);
        if (itemOptional.isPresent()) {
            return ResponseEntity.ok(itemOptional.get());
        } else return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Item> deleteById(@PathVariable("id") String id) {
        Optional<Item> itemOptional = itemRepository.findById(id);
        if (itemOptional.isPresent()) {
            itemRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else
            return ResponseEntity.noContent().build();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Item> update(@PathVariable("id") String id, @RequestBody Item item) {
        Optional<Item> itemOptional = itemRepository.findById(id);
        if (itemOptional.isPresent()) {
            itemOptional.get().setName(item.getName());
            itemOptional.get().setPrice(item.getPrice());
            Item itemUpdate = itemRepository.save(itemOptional.get());
            return ResponseEntity.ok(itemUpdate);
        } else
            return ResponseEntity.noContent().build();
    }
}
