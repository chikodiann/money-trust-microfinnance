package com.example.moneytrustmicrofinnance.services;


import com.example.moneytrustmicrofinnance.domain.model.ModelResponse;
import com.example.moneytrustmicrofinnance.domain.model.MonieTrust;
import com.example.moneytrustmicrofinnance.domain.repository.DataModelRepository;
import com.example.moneytrustmicrofinnance.domain.repository.ResponseRepository;
import com.example.moneytrustmicrofinnance.request.Request;
import com.example.moneytrustmicrofinnance.response.ResponseObject;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static com.example.moneytrustmicrofinnance.utils.Utils.URL_API;

@Component
@RequiredArgsConstructor
public class ServicesImpl {
    private final RestTemplate restTemplate;
    private final DataModelRepository dataModelRepository;
    private final ResponseRepository repository;


    public ResponseObject saveCustomer(Request request){
       ResponseEntity<ResponseObject> response= restTemplate.postForEntity(URL_API,request, ResponseObject.class);
       ResponseObject save_response =   response.getBody();
        MonieTrust saveResponse = new MonieTrust();
        ModelResponse datasModel = mappingResponse(save_response);
        saveResponse.setDatas(datasModel);
        saveResponse.setStatus(save_response.getStatus());
        saveResponse.setMessage(save_response.getMessage());
       repository.save(saveResponse);
       dataModelRepository.save(datasModel);
       return save_response;


    }
    private ModelResponse mappingResponse(ResponseObject modelResponse){
        ModelResponse modelResponse1 = new ModelResponse();
        modelResponse1.setStatus(modelResponse.getStatus());
        modelResponse1.setNumban_number(modelResponse.getData().getNumban_number());
        modelResponse1.setCustomer_access_token(modelResponse.getData().getCustomer_access_token());
        return modelResponse1;
    }

}
