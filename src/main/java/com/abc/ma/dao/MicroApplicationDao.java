package com.abc.ma.dao;

import com.abc.ma.controller.model.CustomerData;
import com.abc.ma.entity.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class MicroApplicationDao {

    @PersistenceContext
    EntityManager entityManager;



    @Transactional
    public Customer addCustomer(Customer customer) throws Exception {
        if(customer == null) {
            System.out.println("Exception Thrown");
            throw new Exception("sad");
        }
        if(customer.getId() == 0) {

            entityManager.persist(customer);
        }else {
            customer = entityManager.merge(customer);
        }

        return customer;
    }
}
