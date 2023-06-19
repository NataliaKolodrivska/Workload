package com.example.workload.service.impl;

import com.example.workload.model.Load;
import com.example.workload.repository.LoadRepository;
import com.example.workload.service.interfaces.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class LoadServiceImpl implements LoadService {
    @Autowired
    LoadRepository repository;

    @Override
    public List<Load> getAll() {
        return repository.findAll();
    }

    @Override
    public Load getOne(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Load create(Load load) {
        load.setCreatedAt(LocalDateTime.now());
        return repository.save(load);
    }

    @Override
    public Load update(Load load) {
        String id = load.getId();
        Load load1 = this.getOne(id);
        load.setCreatedAt(load1.getCreatedAt());
        load.setUpdatedAt(LocalDateTime.now());
        return repository.save(load);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
