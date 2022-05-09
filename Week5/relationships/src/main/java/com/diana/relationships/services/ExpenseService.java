package com.diana.relationships.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.diana.relationships.models.Person;
import com.diana.relationships.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepository;
 
 public ExpenseService(ExpenseRepository expenseRepository) {
     this.expenseRepository = expenseRepository;
 }
 public List<Person> allExpenses() {
     return expenseRepository.findAll();
 }
 public Person create(Person person) {
     return expenseRepository.save(person);
 }
 
 public Person findExpense(Long id) {
     Optional<Person> optionalExpense = expenseRepository.findById(id);
     if(optionalExpense.isPresent()) {
         return optionalExpense.get();
     } else {
         return null;
     }
 }
 
 public Person update(Person person) {
		return expenseRepository.save(person);
 }
 public void delete(long id) {
	expenseRepository.deleteById(id);
 }

}