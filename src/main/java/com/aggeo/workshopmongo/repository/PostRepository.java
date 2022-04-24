package com.aggeo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aggeo.workshopmongo.domain.Post;
import com.aggeo.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	
}
