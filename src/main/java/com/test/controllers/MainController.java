package com.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class MainController {

	@GetMapping("/")
	public String index() {
		System.out.println("we here");
		return "index";
	}
	
}
