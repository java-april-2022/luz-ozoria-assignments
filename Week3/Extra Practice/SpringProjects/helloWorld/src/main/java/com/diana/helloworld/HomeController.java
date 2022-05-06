package com.diana.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/hello")
public class HomeController {
	@RequestMapping("/")
	public String hello() {
		return "index.jsp";
		
	}
	
	@RequestMapping("/new_route")
	public String mylo() {
		return "Tiny cat Mylo!";
	}
	
	@RequestMapping("/world")
	public String world() {
		return "Class level annotations are cool too!";
	}
}