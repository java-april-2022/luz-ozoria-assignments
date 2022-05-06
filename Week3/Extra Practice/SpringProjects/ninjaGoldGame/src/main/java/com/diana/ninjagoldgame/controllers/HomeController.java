package com.diana.ninjagoldgame.controllers;

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
		public String Index() {
			return "redirect:/Gold";
		}
		
		@GetMapping("/Gold")
		public String gold() {
			return "index.jsp";
		}
		
		@RequestMapping("/Gold")
		public String counter(HttpSession session, Model model) {
			Integer currentGold = 0;
			if (session.getAttribute("gold") == null) {
				session.setAttribute("gold", 0);
			} else {
				currentGold = (Integer) session.getAttribute("gold");
			}
			model.addAttribute("gold", currentGold);
			return "index.jsp";
		}
		
	}
