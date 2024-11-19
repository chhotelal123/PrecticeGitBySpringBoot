package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String getIndex(Model model) {
		
		return "index";
	}
	
	
	
	
	@RequestMapping("/home")
	public String getHome(Model model) {
		System.out.println("hello java");
		model.addAttribute("name", "chhotelal");
		return "home";
	}
	@RequestMapping("/about")
	public String getAbout() {
		System.out.println("Hello about");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView getHelp() {
		ModelAndView model=new ModelAndView();
		model.addObject("name","Ram");
		
	List<Integer> list=new ArrayList<Integer>();
	list.add(12);
	list.add(20);
	list.add(85);
	list.add(45);
	list.add(5000);
	model.addObject("mark",list);
		
		
		
		
		model.setViewName("help");
		return model;
	
	
	}
}
