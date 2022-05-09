package com.diana.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diana.dojosandninjas.models.Dojo;
import com.diana.dojosandninjas.models.Ninja;
import com.diana.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	@Autowired
	private NinjaRepository repository;
	
	public List<Ninja> getAll(){
		return repository.findAll();
	}
		
	public Ninja getById(Long id) {
		return repository.findById(id).orElse(null);
	}
		
	public void save(Ninja ninja) {
		repository.save(ninja);
	}
	

	public List<Ninja> getByDojo(Dojo dojo){
		return repository.findAllByDojo(dojo);
	}
}