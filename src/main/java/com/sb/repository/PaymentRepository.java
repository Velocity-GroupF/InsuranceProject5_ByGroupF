package com.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
