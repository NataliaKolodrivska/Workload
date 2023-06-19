package com.example.workload.service.impl;

import com.example.workload.model.Teacher;
import com.example.workload.repository.TeacherRepository;
import com.example.workload.service.interfaces.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepository repository;

    @Override
    public List<Teacher> getAll() {
        return repository.findAll();
    }

    @Override
    public Teacher getOne(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Teacher create(Teacher teacher) {
        teacher.setCreatedAt(LocalDateTime.now());
        return repository.save(teacher);
    }

    @Override
    public Teacher update(Teacher teacher) {
        String id = teacher.getId();
        Teacher teacher1 = this.getOne(id);
        teacher.setCreatedAt(teacher1.getCreatedAt());
        teacher.setUpdatedAt(LocalDateTime.now());
        return repository.save(teacher);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
