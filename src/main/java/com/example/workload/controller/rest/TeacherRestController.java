package com.example.workload.controller.rest;

import com.example.workload.model.Load;
import com.example.workload.model.Teacher;
import com.example.workload.service.interfaces.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teachers")
public class TeacherRestController {
    @Autowired
    TeacherService teacherService;

    @GetMapping("/")
    public List<Teacher> getAll(){
        return teacherService.getAll();
    }

    @GetMapping("/{id}")
    public Teacher getOne(@PathVariable String id){
        return teacherService.getOne(id);
    }

    @PostMapping("/")
    public Teacher create(@RequestBody Teacher teacher){
        return teacherService.create(teacher);
    }

    @PutMapping("/")
    public Teacher update(@RequestBody Teacher teacher){
        return teacherService.update(teacher);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        teacherService.delete(id);
    }
}
