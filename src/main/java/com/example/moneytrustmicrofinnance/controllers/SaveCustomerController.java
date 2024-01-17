package com.example.moneytrustmicrofinnance.controllers;



import com.example.moneytrustmicrofinnance.request.Request;
import com.example.moneytrustmicrofinnance.response.ResponseObject;
import com.example.moneytrustmicrofinnance.services.ServicesImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("api/")
@RestController
public class SaveCustomerController {
    @Autowired
    private  ServicesImpl services;

    @PostMapping("/add-customer")
    public ResponseEntity<ResponseObject> saveCustomer(@RequestBody Request request){
        return new ResponseEntity<>(services.saveCustomer(request), HttpStatus.OK);
    }
}
