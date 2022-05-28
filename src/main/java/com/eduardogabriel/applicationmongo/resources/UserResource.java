package com.eduardogabriel.applicationmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eduardogabriel.applicationmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		
		User maria = new User("1", "Maria Silva", "maria123@gmail.com");
		User alex = new User("2", "Alex Silva", "alex123@gmail.com");
		List<User> pessoas = new ArrayList<User>();
		pessoas.addAll(Arrays.asList(maria,alex));
		
		return ResponseEntity.ok().body(pessoas);
	}
}
