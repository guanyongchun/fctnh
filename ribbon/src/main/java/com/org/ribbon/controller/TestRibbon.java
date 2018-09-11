package com.org.ribbon.controller;

import com.org.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRibbon {
    @Autowired
    private TestService testService;
    @GetMapping(value = "/testzuul")
    public String ribbonTest(@RequestParam String name){
        return testService.TestMethod(name);
    }
}
