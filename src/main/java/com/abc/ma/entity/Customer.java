package com.abc.ma.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER")
@Data
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @Column(name = "NAME")
    private String name;
    @Column(name = "LAST_NAME")
    private String lName;
    @Column(name = "ADDRESS")
    private String address;



}
