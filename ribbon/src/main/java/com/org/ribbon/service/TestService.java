package com.org.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    public String TestMethod(String name){
        return restTemplate.getForObject("http://TEST-EUREKA-CLIENT/test?name="+name,String.class);
    }
}
