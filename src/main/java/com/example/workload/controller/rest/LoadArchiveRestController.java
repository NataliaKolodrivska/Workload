package com.example.workload.controller.rest;

import com.example.workload.model.Load;
import com.example.workload.model.LoadArchive;
import com.example.workload.service.interfaces.LoadArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/load-archives")
public class LoadArchiveRestController {
    @Autowired
    LoadArchiveService loadArchiveService;

    @GetMapping("/")
    public List<LoadArchive> getAll(){
        return loadArchiveService.getAll();
    }

    @GetMapping("/{id}")
    public LoadArchive getOne(@PathVariable String id){
        return loadArchiveService.getOne(id);
    }

    @PostMapping("/")
    public LoadArchive create(@RequestBody LoadArchive loadArchive){
        return loadArchiveService.create(loadArchive);
    }

    @PutMapping("/")
    public LoadArchive update(@RequestBody LoadArchive loadArchive){
        return loadArchiveService.update(loadArchive);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        loadArchiveService.delete(id);
    }
}
