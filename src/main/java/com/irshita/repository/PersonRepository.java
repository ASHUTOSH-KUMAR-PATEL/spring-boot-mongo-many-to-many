package com.irshita.repository;

import com.irshita.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, Integer> {
}
