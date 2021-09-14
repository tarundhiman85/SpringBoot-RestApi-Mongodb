package com.tarun.springbootweb.mongodb.api.resource;
import com.tarun.springbootweb.mongodb.api.model.Link;
import com.tarun.springbootweb.mongodb.api.respository.LinkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LinkController {

    @Autowired
    private LinkRepo repository;

    @PostMapping("/addLink")
    public String saveLink(@RequestBody Link link){
        repository.save(link);
        return "Added link with id :" + link.getId();
    }

    @GetMapping("/findAllLink")
    public List<Link> getLinks(){
        return repository.findAll();
    }

    @GetMapping("/findAllLinks/{id}")
    public Optional<Link> getLink(@PathVariable int id){
        return repository.findById(id);
    }

    @DeleteMapping("/deleteAllLink/{id}")
    public String deleteLink(@PathVariable int id){
        repository.deleteById(id);
        return "link deleted with id :"+id;
    }
}
