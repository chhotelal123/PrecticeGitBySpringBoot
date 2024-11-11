package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Contact {
	@RequestMapping("/contact")
	public String getContact() {
		return "contact";
	}
	
	@RequestMapping(path = "/process" ,method = RequestMethod.POST)
	public String getContact( @RequestParam("email")String useremail,
			@RequestParam("name")String username,
			@RequestParam("password")String userpassword,Model model) 
	
	
	{
		
		
		System.out.println("email:"+useremail);
		System.out.println("name:"+username);
		System.out.println("password:"+userpassword);
		
		model.addAttribute("name", username);
		model.addAttribute("email",useremail);
		model.addAttribute("password", userpassword);
		return"success";
	}
	
	

}
