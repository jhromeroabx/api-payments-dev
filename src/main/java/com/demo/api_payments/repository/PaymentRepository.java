package com.demo.api_payments.repository;

import com.demo.api_payments.model.PaymentMethodModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository <PaymentMethodModel, Integer> {

}
