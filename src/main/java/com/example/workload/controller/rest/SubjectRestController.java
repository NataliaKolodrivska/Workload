package com.example.workload.controller.rest;

import com.example.workload.model.Load;
import com.example.workload.model.Subject;
import com.example.workload.service.interfaces.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subjects")
public class SubjectRestController {
    @Autowired
    SubjectService subjectService;

    @GetMapping("/")
    public List<Subject> getAll(){
        return subjectService.getAll();
    }

    @GetMapping("/{id}")
    public Subject getOne(@PathVariable String id){
        return subjectService.getOne(id);
    }

    @PostMapping("/")
    public Subject create(@RequestBody Subject subject){
        return subjectService.create(subject);
    }

    @PutMapping("/")
    public Subject update(@RequestBody Subject subject){
        return subjectService.update(subject);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        subjectService.delete(id);
    }
}
