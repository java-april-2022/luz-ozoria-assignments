package com.diana.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.diana.bookclub.models.LoginUser;
import com.diana.bookclub.models.User;
import com.diana.bookclub.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	public List<User> getAllUsers(){
		return repo.findAll();
	}

	public User register(User newUser, BindingResult result) {
		Optional<User> potentialUser = repo.findByEmail(newUser.getEmail());
		if(potentialUser.isPresent()) {
			System.out.println("From UserService: email already in DB");
			result.rejectValue("email", "Matches", "An account with that email already exists!");
		}
		 if(!newUser.getPassword().equals(newUser.getConfirm())) {
		 System.out.println("From UserService: passwords do not match");
		 result.rejectValue("confirm", "Matches", "Passwords must match"); }
		 if(result.hasErrors()) { 
			 System.out.println("errors detected"); 
			 return null;
		 }
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		
		User saveUser = repo.save(newUser);
		System.out.println(saveUser);
		return saveUser;
	}
	
	public User login(LoginUser newLogin, BindingResult result) {
		Optional<User> potentialUser = repo.findByEmail(newLogin.getEmail());
		if(!potentialUser.isPresent()) {
			result.rejectValue("email", "Matches", "Email not found");
		}
		User user = potentialUser.get();
		if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
			result.rejectValue("password", "Matches", "Invalid Password");
		}
		if(result.hasErrors()) {
			return null;
		}
		return user;
	}
	
	public User findById(Long id) {
		Optional<User> potentialUser = repo.findById(id);
		if (potentialUser.isPresent()) {
			return potentialUser.get();
		}
		System.out.println("From UserService: user not found");
		return null;
	}
}
