package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleConrtoler {
	@GetMapping("/example")
			 public String ex()
			 {
				 return "example";
			 }
}
