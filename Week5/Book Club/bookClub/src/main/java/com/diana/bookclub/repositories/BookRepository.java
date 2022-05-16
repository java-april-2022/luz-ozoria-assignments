package com.diana.bookclub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diana.bookclub.models.Book;
import com.diana.bookclub.models.User;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	
	List<Book> findAll();
	List<Book> findAllByUser(User user);
}