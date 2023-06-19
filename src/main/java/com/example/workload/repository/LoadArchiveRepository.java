package com.example.workload.repository;

import com.example.workload.model.LoadArchive;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadArchiveRepository extends MongoRepository<LoadArchive, String> {

}
