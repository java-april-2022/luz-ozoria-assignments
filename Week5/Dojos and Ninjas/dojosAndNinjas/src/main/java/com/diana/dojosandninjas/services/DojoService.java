package com.diana.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diana.dojosandninjas.models.Dojo;
import com.diana.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepository repository;
	
	public List<Dojo> getAllDojos(){
		return repository.findAll();
	}

	public Dojo getById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public void save(Dojo dojo) {
		repository.save(dojo);
	}
}