package com.demo.api_payments.mapper;

import com.demo.api_payments.dtos.response.InstallmentDTO;
import com.demo.api_payments.model.InstallmentModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InstallmentMapper {

   @Mapping(source = "quantity", target = "quantity")
   @Mapping(source = "interest", target = "interest")
   InstallmentDTO installmentToInstallmentDTO(InstallmentModel installmentModel);
}
