/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multipolar.bootcamp.spring.appecommerce.repository;

import com.multipolar.bootcamp.spring.appecommerce.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author acer
 */
public interface TransactionRepository extends CrudRepository<Transaction, String> {
}
