package com.example.workload.controller.rest;

import com.example.workload.model.Load;
import com.example.workload.service.interfaces.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/loads")
public class LoadRestController {

    @Autowired
    LoadService loadService;

    @GetMapping("/")
    public List<Load> getAll(){
        return loadService.getAll();
    }

    @GetMapping("/{id}")
    public Load getOne(@PathVariable String id){
        return loadService.getOne(id);
    }

    @PostMapping("/")
    public Load create(@RequestBody Load load){
        return loadService.create(load);
    }

    @PutMapping("/")
    public Load update(@RequestBody Load load){
        return loadService.update(load);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        loadService.delete(id);
    }
}
