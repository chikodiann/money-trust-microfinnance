package com.example.moneytrustmicrofinnance.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class ResponseObject {
    private String status;
    private String message;
    private Datas data;


}
