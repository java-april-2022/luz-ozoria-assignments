package com.diana.formsubmission.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/login", method=RequestMethod.POST)
	public String login(
		@RequestParam(value="email") String email,
	    	@RequestParam(value="password") String password) {
	    
	    	// CODE TO PROCESS FORM ie. check email and password
	    	
	    	return "redirect:/dashboard"; // <-- we'll change this when we learn redirecting
	}

}

