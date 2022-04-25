package com.diana.omikujiform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String omikuji() {
		return "index.jsp";
	}
	
	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		String output = (String) session.getAttribute("fortune");
		model.addAttribute("output", output);
		return "show.jsp";
	}
	
	@PostMapping("/processForm")
	public String process(@RequestParam("number") int number, @RequestParam("city") String city, @RequestParam("person") String person, @RequestParam("hobby") String hobby, @RequestParam("living") String living, @RequestParam("comment") String comment, HttpSession session) {
		String fortune = String.format("In %s years, you will live in %s with %s as your roomate, %s. The next time you see a %s, you will have good luck. Also %s.", number, city, person, hobby, living, comment);
		session.setAttribute("fortune", fortune);
		return "redirect:/omikuji/show";
	}
}