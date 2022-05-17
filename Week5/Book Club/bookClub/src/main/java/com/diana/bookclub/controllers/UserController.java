package com.diana.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.diana.bookclub.models.LoginUser;
import com.diana.bookclub.models.User;
import com.diana.bookclub.services.BookService;
import com.diana.bookclub.services.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private BookService bookService;
    
    @GetMapping("/")
 	public String index(Model model) {
 		model.addAttribute("newUser", new User());
 		model.addAttribute("newLogin", new LoginUser());
 		
 		return "index.jsp";
 	}
    
    @PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult results, Model model, HttpSession session){
		User user = userService.register(newUser, results);
		if(results.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}
		session.setAttribute("userId", user.getId());
		
		return "redirect:/home";
	}
    
    @PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult results, Model model, HttpSession session) {
		
		User user = userService.login(newLogin, results);
		// checking for errors in form
		if(results.hasErrors()) {
			// binding empty object to JSP
			model.addAttribute("newUser", new User());
			return "index.jsp";
		}
		
		// continue, get ID from DB, store in session
		session.setAttribute("userId", user.getId());
		
		return "redirect:/home";
	}
    
    @GetMapping("/home")
	public String home(Model model, HttpSession session) {
		
		// checking user is logged in(session)
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
			
		// getting user info from session
		// & saving in model
		model.addAttribute("user", userService.findById((Long) session.getAttribute("userId")));
		model.addAttribute("allBooks", bookService.getAllBooks());
		return "dashboard.jsp";
	}

    
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
}