package com.diana.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HomeControllers {
	@RequestMapping("/")
	public String index(
			@RequestParam(value="name", required=false) String name, 
			@RequestParam(value="last_name", required=false) String last_name){
		
		if (name == null ) {
			return "Hello Human";
		}
		else if (name != null && last_name == null) {
			return "Hello" + " " + name;
		} 
		else 
			return "Hello" + " " + name + " " + last_name;
	}
}
