package com.example.workload.service.interfaces;


import com.example.workload.model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAll();
    Teacher getOne(String id);
    Teacher create(Teacher teacher);
    Teacher update(Teacher teacher);
    void delete(String id);
}
