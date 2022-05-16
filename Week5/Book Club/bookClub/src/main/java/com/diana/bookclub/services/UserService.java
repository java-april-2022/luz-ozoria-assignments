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
	private UserRepository repo;
	
	public List<User> getAllUsers(){
		return repo.findAll();
	}
    
    public User register(User newUser, BindingResult result) {

    	Optional<User> regUser = repo.findByEmail(newUser.getEmail());
    	if (regUser.isPresent()) {
    		result.rejectValue("email", "Unique", "An account with this email already exists.");
    	}
    	
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    	    result.rejectValue("confirm", "Matches", "Passwords must match!");
    	}

    	if(result.hasErrors()) {
    		System.out.println("Please review input and try again!");
    		return null;
    	}
    
    	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	newUser.setPassword(hashed);
    	
    	newUser = repo.save(newUser);
    	System.out.println("Success! A new user has been created!");
    	
        return newUser;
    }
    
    public User login(LoginUser newLogin, BindingResult result) {

    	Optional<User> userFind = repo.findByEmail(newLogin.getEmail());
    	if (!userFind.isPresent()) {
    		result.rejectValue("email", "MissingAccount", "No account exists with this email.");
    		return null;
    	}
    	
    	User user = userFind.get();
        
    	if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
    	    result.rejectValue("password", "Matches", "Invalid Password!");
    	}
    	
    	if(result.hasErrors()) {
    		return null;
    	}
    	
        return user;
    }

	public User findByEmail(String email) {
		
		Optional<User> result = repo.findByEmail(email);
		if(result.isPresent()) {
			return result.get();
		}
		
		return null;
	}
	
	public User findById(Long id) {
		
		Optional<User> result = repo.findById(id);
		if(result.isPresent()) {
			return result.get();
		}
		System.out.println("Sorry! User not found!");
		return null;
	}
}