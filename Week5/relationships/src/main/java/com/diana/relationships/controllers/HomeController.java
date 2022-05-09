package com.diana.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diana.relationships.models.Person;
import com.diana.relationships.services.ExpenseService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@Controller
public class HomeController {
	
	@Autowired 
	ExpenseService expenseService;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense") Person person, Model model) {
		List<Person> persons = expenseService.allExpenses();
		model.addAttribute("expenses", persons);
		return "index.jsp";
	}
	
	@PostMapping("/licenses")
	public String licenses(@Valid @ModelAttribute("license") License license) {
	    // error handling with binding result omitted    
	    licenseService.create(license); // Already has the person!
	        
	    return "redirect:/persons";
	}

	@GetMapping("/expenses/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
        Person person = expenseService.findExpense(id);
        model.addAttribute("expense", person);
        return "edit.jsp";
    }
    
	@PutMapping("/expenses/edit/{id}")
	public String update(@PathVariable("id") Long id, Model model, @Valid @ModelAttribute("expense") Person person, BindingResult result) {
        if(result.hasErrors()) {
			List<Person> persons = expenseService.allExpenses();
			model.addAttribute("expenses", persons);
        	return "redirect:/expenses/edit/{id}";
        }else {
        	expenseService.update(person);
        	return "redirect:/expenses";
        }
    }
	@DeleteMapping("/expenses/delete/{id}")
	public String delete(@PathVariable long id) {
		expenseService.delete(id);
		return "redirect:/expenses";
	}
	
	@GetMapping("/persons/{person_id}")
	public String showPerson(@PathVariable Long person_id, Model model) {
	    
	    Person someAwesomePerson = personService.findById(person_id);
	    model.addAttribute("person", someAwesomePerson);
	    
	    return "showPerson.jsp";
	}


	
	
}