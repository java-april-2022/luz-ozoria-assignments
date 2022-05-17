package com.diana.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.diana.bookclub.models.Book;
import com.diana.bookclub.services.BookService;


@Controller
public class BookController {

     @Autowired
     private BookService bookService;
    
    
     @GetMapping("/books/new")
 	public String newBook(Model model, HttpSession session) {

 		model.addAttribute("newBook", new Book());

 		model.addAttribute("sessionId", session.getAttribute("userId"));
 		return "addBook.jsp";
 	}
    
    @PostMapping("/books/add")
	public String addBook(@Valid @ModelAttribute("newBook") Book newBook, BindingResult results) {

		if(results.hasErrors()) {
			return "addBook.jsp";
		}
		bookService.saveBook(newBook);
		return "redirect:/home";
	}
    
    @GetMapping("/books/{id}")
	public String view(@PathVariable("id") Long id, Model model, HttpSession session) {

		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		model.addAttribute("book", bookService.getById(id));
		model.addAttribute("userId", session.getAttribute("userId"));
		return "showBook.jsp";
	}
    
    @GetMapping("/books/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Book book = bookService.getById(id);
		model.addAttribute("book", book);
		return "editBook.jsp";
	}

    
    @PutMapping("/books/update/{id}")
	public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "editBook.jsp";
		}
		bookService.saveBook(book);
		return "redirect:/home";
	}
}
