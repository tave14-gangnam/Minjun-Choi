package com.example.tave.week3.assignment.Repository;

import com.example.tave.week3.assignment.domain.CUSTOMER;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CUSTOMER, Long> {
}
