package com.abc.ma.controller.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;


@Data
@Builder
@Generated
public class CustomerData {


    private int id;


    private String name;

    private String lName;

    private String address;
}
