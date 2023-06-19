package com.example.workload.service.impl;

import com.example.workload.model.Schedule;
import com.example.workload.repository.ScheduleRepository;
import com.example.workload.service.interfaces.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    ScheduleRepository repository;

    @Override
    public List<Schedule> getAll() {
        return repository.findAll();
    }

    @Override
    public Schedule getOne(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Schedule create(Schedule schedule) {
        schedule.setCreatedAt(LocalDateTime.now());
        return repository.save(schedule);
    }

    @Override
    public Schedule update(Schedule schedule) {
        String id = schedule.getId();
        Schedule schedule1 = this.getOne(id);
        schedule.setCreatedAt(schedule1.getCreatedAt());
        schedule.setUpdatedAt(LocalDateTime.now());
        return repository.save(schedule);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
