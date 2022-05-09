package com.diana.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diana.relationships.models.Person;

@Repository
public interface ExpenseRepository extends CrudRepository<Person, Long>{
    List<Person> findAll();
    List<Person> findByDescriptionContaining(String search);
}
