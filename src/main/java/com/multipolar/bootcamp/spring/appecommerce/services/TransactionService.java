/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multipolar.bootcamp.spring.appecommerce.services;

import com.multipolar.bootcamp.spring.appecommerce.entity.Item;
import com.multipolar.bootcamp.spring.appecommerce.entity.Transaction;
import com.multipolar.bootcamp.spring.appecommerce.entity.TransactionDetail;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransactionDetailRepository;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransactionRepository;
import com.multipolar.bootcamp.spring.appecommerce.repository.ItemRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author acer
 */
@Service
@Transactional(readOnly = true)
public class TransactionService {

    @Autowired
    private TransactionRepository transRepo;
    @Autowired
    private TransactionDetailRepository detailRepo;
    @Autowired
    private ItemRepository itemRepo;

    public Iterable<Transaction> findAll() {
        return transRepo.findAll();
    }

    public Optional<Transaction> findById(String id) {
        return this.transRepo.findById(id);
    }
    
    @Transactional
    public Transaction buy(Transaction trans){
        List<TransactionDetail> details = trans.getDetails();
        trans = transRepo.save(trans);
        double total = 0;
        for (TransactionDetail detail : details) {
            detail.setTransaction(trans);
//get Item Data            
            Optional<Item> itemOptional = itemRepo.findById(detail.getItem().getId());
//decrease item qty from buyer item qty            
            itemOptional.get().setQty(itemOptional.get().getQty()-detail.getQty());

//set detail price from item price
            detail.setPrice(itemOptional.get().getPrice());
            
//set total payment            
            total += detail.getPrice()*detail.getQty();
            detailRepo.save(detail);
        }
// update total payment to database        
            trans.setTotal(total);
            transRepo.save(trans);
        
        Optional<Transaction> transactionOpt = transRepo.findById(trans.getId());
        return transactionOpt.get();
    }
}
