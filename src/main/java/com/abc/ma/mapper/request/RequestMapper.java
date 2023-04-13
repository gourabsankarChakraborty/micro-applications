package com.abc.ma.mapper.request;

import com.abc.ma.controller.model.CustomerData;
import com.abc.ma.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class RequestMapper {

    public Customer mapCustomerDataToCustomer(CustomerData request) {
        return Customer.builder()
                .name(request.getName())
                .lName(request.getLName())
                .address(request.getAddress())
                .build();
    }
}
