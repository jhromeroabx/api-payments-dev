package com.demo.api_payments.controller;

import com.demo.api_payments.dtos.response.ResponsePaymentMethodDTO;
import com.demo.api_payments.service.PaymentMethodService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PaymentMethodController {

   private final PaymentMethodService paymentMethodService;

   @GetMapping("/payment-methods")
   public ResponseEntity <ResponsePaymentMethodDTO> getPaymentMethodDTO() {

      return ResponseEntity.status(HttpStatus.OK).body(paymentMethodService.getPaymentMethodDTO());
   }
}


