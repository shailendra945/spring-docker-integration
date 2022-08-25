package com.infoiv.springdockerintegration.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
	
	@GetMapping
	public String welcomeMessage() {
		return "Hello User ! it's " +LocalDateTime.now();
	}

}
