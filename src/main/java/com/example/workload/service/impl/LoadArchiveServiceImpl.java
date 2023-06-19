package com.example.workload.service.impl;

import com.example.workload.model.LoadArchive;
import com.example.workload.repository.LoadArchiveRepository;
import com.example.workload.service.interfaces.LoadArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class LoadArchiveServiceImpl implements LoadArchiveService {
    @Autowired
    LoadArchiveRepository repository;

    @Override
    public List<LoadArchive> getAll() {
        return repository.findAll();
    }

    @Override
    public LoadArchive getOne(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public LoadArchive create(LoadArchive loadArchive) {
        return repository.save(loadArchive);
    }

    @Override
    public LoadArchive update(LoadArchive loadArchive) {
        return repository.save(loadArchive);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    public void deleteForArchive(List<LoadArchive> loadArchives){
        loadArchives = this.getAll();
        for (LoadArchive load: loadArchives) {
            if(LocalDateTime.now().getYear() - load.getLoad().getCreatedAt().getYear() > 5){
                this.delete(load.getId());
            }
        }
    }
}