package com.example.SpringJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class Controller {
@Autowired
    StudentRepo repo;
@PostMapping
    public Student setdetails(@RequestBody Student s){

        return repo.save(s) ;
}
@GetMapping
    public List<Student> getdetails(){

    return repo.findAll();
}
@GetMapping("/{id}")
    public Student getbyid(@PathVariable int id){

    return repo.findById(id).orElse(null);
}

}
