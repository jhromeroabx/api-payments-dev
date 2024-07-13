package com.demo.api_payments.repository;

import com.demo.api_payments.model.InstallmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstallmentRepository extends JpaRepository <InstallmentModel, Integer> {

}
