package com.example.workload.service.interfaces;


import com.example.workload.model.LoadArchive;

import java.util.List;

public interface LoadArchiveService {
    List<LoadArchive> getAll();
    LoadArchive getOne(String id);
    LoadArchive create(LoadArchive loadArchive);
    LoadArchive update(LoadArchive loadArchive);
    void delete(String id);
}
