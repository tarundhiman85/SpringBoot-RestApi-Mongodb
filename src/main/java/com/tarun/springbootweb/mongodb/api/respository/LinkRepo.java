package com.tarun.springbootweb.mongodb.api.respository;


import com.tarun.springbootweb.mongodb.api.model.Link;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinkRepo extends MongoRepository<Link, Integer> {
}
