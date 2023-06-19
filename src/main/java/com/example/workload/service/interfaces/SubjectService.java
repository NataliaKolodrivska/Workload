package com.example.workload.service.interfaces;


import com.example.workload.model.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> getAll();
    Subject getOne(String id);
    Subject create(Subject subject);
    Subject update(Subject subject);
    void delete(String id);
}
