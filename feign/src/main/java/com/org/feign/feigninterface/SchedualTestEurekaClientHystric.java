package com.org.feign.feigninterface;

import org.springframework.stereotype.Component;

@Component
public class SchedualTestEurekaClientHystric implements SchedualTestEurekaClient {

    @Override
    public String TestFeign(String name) {
        return "error"+name;
    }
}
