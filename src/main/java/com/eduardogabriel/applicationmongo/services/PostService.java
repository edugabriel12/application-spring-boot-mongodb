package com.eduardogabriel.applicationmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardogabriel.applicationmongo.domain.Post;
import com.eduardogabriel.applicationmongo.repository.PostRepository;
import com.eduardogabriel.applicationmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado")); 
	}
	
	public List<Post> findByTitulo(String text) {
		return repo.searchTitle(text);
	}

}
