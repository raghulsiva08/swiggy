package com.skillfirstlab.swiggy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillfirstlab.swiggy.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}