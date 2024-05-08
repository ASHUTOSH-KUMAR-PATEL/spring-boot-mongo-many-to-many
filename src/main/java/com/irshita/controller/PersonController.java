package com.irshita.controller;

import com.irshita.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/")
public class PersonController {

    @Autowired
    private MongoRepository mongoRepository;

    @PostMapping(path = "addPerson")
    public String savePerson(@RequestBody Person person){
        mongoRepository.save(person);
        return "Saved Successfully...";
    }

    @GetMapping(path = "getAllPersons")
    public List<Person> getAllPersons(){
        return mongoRepository.findAll();
    }

    @DeleteMapping(path = "deletePerson/{id}")
    public String deletePerson(@PathVariable int id){
        mongoRepository.deleteById(id);
        return "Person deleted successfully...";
    }

}
