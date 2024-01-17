package com.example.moneytrustmicrofinnance.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Request {
    private String merchant_code;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String email;
    private  String phone;
    private String address;
    private String bvn;
    private String merchant_customer_id;
}
