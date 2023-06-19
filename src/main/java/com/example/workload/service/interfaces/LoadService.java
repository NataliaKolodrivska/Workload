package com.example.workload.service.interfaces;

import com.example.workload.model.Load;

import java.util.List;

public interface LoadService {
    List<Load> getAll();
    Load getOne(String id);
    Load create(Load load);
    Load update(Load load);
    void delete(String id);
}
