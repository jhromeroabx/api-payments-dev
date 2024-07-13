package com.demo.api_payments.mapper;

import com.demo.api_payments.dtos.response.PaymentMethodDTO;
import com.demo.api_payments.model.PaymentMethodModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {InstallmentMapper.class})
public interface PaymentMethodMapper {

   @Mapping(source = "id", target = "idPaymentMethod")
   @Mapping(source = "entity", target = "entity")
   @Mapping(source = "installments", target = "installments")
   PaymentMethodDTO toResponsePaymentMethodDTO(PaymentMethodModel paymentMethodModel);

}
