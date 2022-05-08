package com.helloworld.demoproject.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController

public class HomeController {


@GetMapping(value="/home")
public String home() {
	System.out.println("hello world from home");
	
	return "This is Hello World program.";
}


}

