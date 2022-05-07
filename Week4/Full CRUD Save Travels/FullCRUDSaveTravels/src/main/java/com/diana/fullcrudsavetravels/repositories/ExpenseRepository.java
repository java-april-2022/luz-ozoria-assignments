package com.diana.fullcrudsavetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diana.fullcrudsavetravels.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>{
    List<Expense> findAll();
    List<Expense> findByDescriptionContaining(String search);
}
