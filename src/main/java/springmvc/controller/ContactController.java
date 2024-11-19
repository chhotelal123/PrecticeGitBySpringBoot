package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller

public class ContactController {
	
	
	@Autowired
	private UserService service;
	 @ModelAttribute
	public void commanDataForAll(Model model) {
		model.addAttribute("desc", "This Working For mvc Project");
		model.addAttribute("title", "SpringMvc");

	}
	
	
	@RequestMapping("/contact")
	public String getContact() {
		return "contact";
	}
	
	@RequestMapping(path = "/process" ,method = RequestMethod.POST)
	public String getContact( @ModelAttribute User user,Model model) 
		{
		
		System.out.println(user);
				System.out.println(user.getName());
				System.out.println(user.getEmail());

				System.out.println(user.getPassword());


	int i = this.service.createUser(user);
	
	//model.addAttribute("msg", "User created"+i);

		System.out.println(i);
		return"success";
	}
	
	

}



/*
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
		
		User user=new User();
		user.setEmail(useremail);
		user.setName(username);
		user.setPassword(userpassword);
		System.out.println(user);
		
//		System.out.println("email:"+useremail);
//		System.out.println("name:"+username);
//		System.out.println("password:"+userpassword);
		
//		model.addAttribute("name", username);
//		model.addAttribute("email",useremail);
//		model.addAttribute("password", userpassword);
		model.addAttribute("user",user);
		return"success";
	}
	
	

}

*/