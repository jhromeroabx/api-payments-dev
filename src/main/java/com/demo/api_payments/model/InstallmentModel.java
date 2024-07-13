package com.demo.api_payments.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "installments")
public class InstallmentModel {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id_installment")
   private Integer id;
   @Column(name = "quantity")
   private Integer quantity;
   @Column(name = "interest")
   private String interest;
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "id_payment_method")
   private PaymentMethodModel paymentMethod;

}
