package com.example.moneytrustmicrofinnance.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebClientConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
// just adding some things here
