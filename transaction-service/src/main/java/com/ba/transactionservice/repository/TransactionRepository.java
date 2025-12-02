package com.ba.transactionservice.repository;

import org.springframework.data.jpa.repository.JapRepository;
import com.ba.model.Transaction;
import java.util.List;

public interface TransactionRepository extends JapRepository<Transaction, Long> {
    List<Transaction> findAccountId(Long accountId);
};