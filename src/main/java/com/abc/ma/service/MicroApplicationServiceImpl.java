package com.abc.ma.service;

import com.abc.ma.mapper.request.RequestMapper;
import com.abc.ma.mapper.response.ResponseMapper;
import com.abc.ma.controller.model.CustomerData;
import com.abc.ma.dao.MicroApplicationDao;
import com.abc.ma.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MicroApplicationServiceImpl implements MicroApplicationService {

    @Autowired
    MicroApplicationDao dao;

    @Autowired
    RequestMapper requestMapper;


    @Autowired
    ResponseMapper responseMapper;
    @Override
    public String getCustomer() {
        return "test";
    }

    @Override
    public CustomerData addCustomer(CustomerData request) {
        Customer customer = requestMapper.mapCustomerDataToCustomer(request);
        try {
            customer = dao.addCustomer(customer);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return responseMapper.mapCustomerToCustomerData(customer);
    }
}
