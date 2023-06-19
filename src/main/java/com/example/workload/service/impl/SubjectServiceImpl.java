package com.example.workload.service.impl;

import com.example.workload.model.Subject;
import com.example.workload.repository.SubjectRepository;
import com.example.workload.service.interfaces.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    SubjectRepository repository;

    @Override
    public List<Subject> getAll() {
        return repository.findAll();
    }

    @Override
    public Subject getOne(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Subject create(Subject subject) {
        subject.setCreatedAt(LocalDateTime.now());
        return repository.save(subject);
    }

    @Override
    public Subject update(Subject subject) {
        String id = subject.getId();
        Subject subject1 = this.getOne(id);
        subject.setCreatedAt(subject1.getCreatedAt());
        subject.setUpdatedAt(LocalDateTime.now());
        return repository.save(subject);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
