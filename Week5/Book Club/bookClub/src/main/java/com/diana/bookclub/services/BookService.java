package com.diana.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diana.bookclub.models.Book;
import com.diana.bookclub.models.User;
import com.diana.bookclub.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepo;
	
	public List<Book> getAllBooks(){
		return bookRepo.findAll();
	}

	public List<Book> getByUser(User user){
		return bookRepo.findAllByUser(user);
	}
	
	public Book getById(Long id) {
		Optional<Book> potentialBook = bookRepo.findById(id);
		if (potentialBook.isPresent()) {
			return potentialBook.get();
		}
		System.out.println("From BookService: book not found");
		return null;
	}
	
	public void saveBook(Book book) {
		bookRepo.save(book);
	}
}
