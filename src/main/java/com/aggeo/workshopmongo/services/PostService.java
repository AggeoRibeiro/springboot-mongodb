package com.aggeo.workshopmongo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aggeo.workshopmongo.domain.Post;
import com.aggeo.workshopmongo.domain.User;
import com.aggeo.workshopmongo.dto.UserDTO;
import com.aggeo.workshopmongo.repository.PostRepository;
import com.aggeo.workshopmongo.repository.UserRepository;
import com.aggeo.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
	    Optional<Post> user = repo.findById(id);
	    return user.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
	}	
	public List<Post> findByTitle (String text){
		return repo.searchTitle(text);
	}
	
	public List <Post> fullsearch (String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
		return repo.fullSearch(text, minDate, maxDate);
	}
	
}
