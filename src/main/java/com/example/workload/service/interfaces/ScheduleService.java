package com.example.workload.service.interfaces;

import com.example.workload.model.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getAll();
    Schedule getOne(String id);
    Schedule create(Schedule schedule);
    Schedule update(Schedule schedule);
    void delete(String id);
}
