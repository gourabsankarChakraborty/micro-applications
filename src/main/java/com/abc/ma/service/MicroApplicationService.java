package com.abc.ma.service;

import com.abc.ma.controller.model.CustomerData;

public interface MicroApplicationService {
    String getCustomer();

    CustomerData addCustomer(CustomerData request);
}
