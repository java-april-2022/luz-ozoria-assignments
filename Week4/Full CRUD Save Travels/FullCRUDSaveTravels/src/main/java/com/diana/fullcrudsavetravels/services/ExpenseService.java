package com.diana.fullcrudsavetravels.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.diana.fullcrudsavetravels.models.Expense;
import com.diana.fullcrudsavetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepository;
 
 public ExpenseService(ExpenseRepository expenseRepository) {
     this.expenseRepository = expenseRepository;
 }
 public List<Expense> allExpenses() {
     return expenseRepository.findAll();
 }
 public Expense create(Expense expense) {
     return expenseRepository.save(expense);
 }
 
 public Expense findExpense(Long id) {
     Optional<Expense> optionalExpense = expenseRepository.findById(id);
     if(optionalExpense.isPresent()) {
         return optionalExpense.get();
     } else {
         return null;
     }
 }
 
 public Expense update(Expense expense) {
		return expenseRepository.save(expense);
 }
 public void delete(long id) {
	expenseRepository.deleteById(id);
 }

}