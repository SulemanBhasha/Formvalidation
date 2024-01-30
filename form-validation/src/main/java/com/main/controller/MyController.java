package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.main.entity.LoginData;

import jakarta.validation.Valid;

@Controller
public class MyController {
	@GetMapping("/form")
	public String openForm(Model model)
	{
		model.addAttribute("login data", new LoginData());
		System.out.println(" opene form controller hit");
		return "form";
	}
// handler process form
	@PostMapping("/submit")
	public String processFor(@Valid @ModelAttribute("LoginData") LoginData logindata ,BindingResult  bindingResult )
	{
		if(bindingResult.hasErrors())
		{
			System.out.println(bindingResult);
			return "form";
		}
		System.out.println(logindata);
		return "sucess";
	}
}
