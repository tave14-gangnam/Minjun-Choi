package com.example.tave.week3.assignment.Repository;

import com.example.tave.week3.assignment.domain.Bank;
import com.example.tave.week3.assignment.domain.CUSTOMER;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankRepository extends JpaRepository<Bank, Long> {
    Optional<Object> findById(String customername);
}
