package com.abc.ma.dao;

import com.abc.ma.entity.Customer;
import com.abc.ma.exception.ApplicationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;

import java.lang.reflect.Executable;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.util.Assert.*;

@ExtendWith(MockitoExtension.class)
public class MicroApplicationDaoTest {

    @Mock
    EntityManager em;

    @InjectMocks
    private MicroApplicationDao dao;

    @BeforeEach
    public void setUp() {
//        dao = new MicroApplicationDao();
//        em = mock(EntityManager.class);
    }


    @Test
    public void add_customer_test() throws Exception {
        Customer req = Customer.builder().lName("sankar").name("gourab").address("bata").build();
        doNothing().when(em).persist(any(Customer.class));
        Customer expected = dao.addCustomer(req);
        notNull(expected);
    }

    @Test
    public void update_customer_test() throws Exception {
        Customer req = Customer.builder().lName("sankar").name("gourab").address("bata").id(1).build();
        Customer response = Customer.builder().lName("sankar").name("gourab").address("bata").id(1).build();
        when(em.merge(req)).thenReturn(response);

        Customer expected = dao.addCustomer(req);

        assertEquals(1, expected.getId());
    }

    @Test
    public void update_customer_exception_test() throws Exception {

        ApplicationException expected = assertThrows(ApplicationException.class, ()-> dao.addCustomer(null));
        Assertions.assertEquals(expected.getMessage(), "Invalid Input");
    }

}
