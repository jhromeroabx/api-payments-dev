package com.demo.api_payments.dtos.response;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponsePaymentMethodDTO implements Serializable {

   private List <PaymentMethodDTO> paymentMethods;
}
