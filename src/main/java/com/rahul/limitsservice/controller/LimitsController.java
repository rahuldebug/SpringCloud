package com.rahul.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.limitsservice.bean.Limits;

@RestController
@RequestMapping("/api")
public class LimitsController {
	@GetMapping("/limits")
	public Limits retrievLimits() {
		return new Limits(1,1000);
	}

}
