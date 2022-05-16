package com.diana.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.diana.dojosandninjas.models.Dojo;
import com.diana.dojosandninjas.models.Ninja;
import com.diana.dojosandninjas.services.DojoService;
import com.diana.dojosandninjas.services.NinjaService;

@Controller
public class HomeController {
	
	@Autowired
	private DojoService dojoService;
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/dojos/new";
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("newDojo") Dojo newDojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/dojo/create")
	public String addDojo(@Valid @ModelAttribute("newDojo") Dojo newDojo, BindingResult results) {
		if(results.hasErrors()) {
			return "newDojo.jsp";
		} else {
			dojoService.save(newDojo);
			return "show.jsp";
		}
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("newNinja") Ninja newNinja, Model model) {
		model.addAttribute("allDojos", dojoService.getAllDojos());
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninja/create")
	public String addNinja(@Valid @ModelAttribute("newNinja") Ninja newNinja, BindingResult results, Model model) {
		if(results.hasErrors()) {
			model.addAttribute("allDojos", dojoService.getAllDojos());
			return "newNinja.jsp";
		} else {
			ninjaService.save(newNinja);
			return "redirect:/dojos/{id}";
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoService.getById(id);
		model.addAttribute("dojo", dojo);
		model.addAttribute("ninjas", ninjaService.getByDojo(dojo));
		return "show.jsp";
	}
}