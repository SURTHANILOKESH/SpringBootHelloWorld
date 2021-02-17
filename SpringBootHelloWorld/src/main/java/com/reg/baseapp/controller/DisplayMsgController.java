package com.reg.baseapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayMsgController {
	
	
	@Autowired
	TestBean test;
	
	@GetMapping("/starting")
	public TestBean Display() {
		
		test.setId(1);
		test.setName("Test");
		test.setEmail("test@test.com");
		return test;
	}

}
