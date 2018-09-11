package com.org.feign.controller;

import com.org.feign.feigninterface.SchedualTestEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFeign {
    @Autowired
    private SchedualTestEurekaClient schedualTestEurekaClient;

    @GetMapping(value = "/testzuul")
    public String testFeignClient(@RequestParam String name){
        return schedualTestEurekaClient.TestFeign(name);
    }
}
