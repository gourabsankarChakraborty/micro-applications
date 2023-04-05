package com.abc.ma.controller.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CustomerData {


    private int id;


    private String name;

    private String lName;

    private String address;
}
