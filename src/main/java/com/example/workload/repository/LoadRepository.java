package com.example.workload.repository;

import com.example.workload.model.Load;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadRepository extends MongoRepository<Load, String> {

}
