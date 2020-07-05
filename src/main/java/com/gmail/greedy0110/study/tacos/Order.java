package com.gmail.greedy0110.study.tacos;

import lombok.Data;

import java.util.Date;

@Data
public class Order {

    private Long id;
    private Date createdAt;
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
