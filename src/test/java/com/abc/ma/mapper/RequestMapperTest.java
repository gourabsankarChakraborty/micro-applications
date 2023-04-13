package com.abc.ma.mapper;

import com.abc.ma.controller.model.CustomerData;
import com.abc.ma.entity.Customer;
import com.abc.ma.mapper.request.RequestMapper;
import org.junit.Assert;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class RequestMapperTest {

    @InjectMocks
    RequestMapper requestMapper;

    @Test
    public void mapCustomerDataToCustomer_Test(){
        CustomerData cust = CustomerData.builder()
                .name("Gourab")
                .lName("Chak")
                .address("Bata")
                .build();

        Customer expected = requestMapper.mapCustomerDataToCustomer(cust);


        Assert.assertEquals(expected.getName(), cust.getName());
        Assert.assertEquals(expected.getLName(), cust.getLName());
        Assert.assertEquals(expected.getAddress(), cust.getAddress());
    }
}
