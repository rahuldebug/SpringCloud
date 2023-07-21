package com.rahul.limitsservice.controller;

import com.rahul.limitsservice.configuration.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.limitsservice.bean.Limits;

@RestController
@RequestMapping("/api")
public class LimitsController {
    private Configuration configuration;

    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retrievLimits() {
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
        //return new Limits(1, 1000);
    }

}
