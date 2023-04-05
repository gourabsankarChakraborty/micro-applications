package com.abc.ma.controller.mapper.response;

import com.abc.ma.controller.model.CustomerData;
import com.abc.ma.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class ResponseMapper {

    public CustomerData mapCustomerToCustomerData(Customer customer) {
        return CustomerData.builder()
                .id(customer.getId())
                .name(customer.getName())
                .lName(customer.getLName())
                .address(customer.getAddress())
                .build();
    }
}
