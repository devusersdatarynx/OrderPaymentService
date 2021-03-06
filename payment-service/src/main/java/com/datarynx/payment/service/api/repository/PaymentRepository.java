package com.datarynx.payment.service.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datarynx.payment.service.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    Payment findByOrderId(int orderId);
}

