package com.eduardogabriel.applicationmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eduardogabriel.applicationmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
