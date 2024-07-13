package com.demo.api_payments.service;

import com.demo.api_payments.dtos.response.PaymentMethodDTO;
import com.demo.api_payments.dtos.response.ResponsePaymentMethodDTO;
import com.demo.api_payments.mapper.PaymentMethodMapper;
import com.demo.api_payments.model.PaymentMethodModel;
import com.demo.api_payments.repository.PaymentRepository;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentMethodService {

   private final PaymentRepository paymentRepository;
   private final PaymentMethodMapper paymentMethodMapper;

   public ResponsePaymentMethodDTO getPaymentMethodDTO() {
      List <PaymentMethodModel> paymentMethods = paymentRepository.findAll();

      List <PaymentMethodDTO> paymentMethodDTOs = new ArrayList <>();
      for (PaymentMethodModel paymentMethod : paymentMethods) {
         PaymentMethodDTO paymentMethodDTO = paymentMethodMapper.toResponsePaymentMethodDTO(paymentMethod);
         paymentMethodDTOs.add(paymentMethodDTO);
      }
      return ResponsePaymentMethodDTO.builder().paymentMethods(paymentMethodDTOs).build();
   }
}
