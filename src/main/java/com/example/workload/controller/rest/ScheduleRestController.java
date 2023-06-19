package com.example.workload.controller.rest;

import com.example.workload.model.Load;
import com.example.workload.model.Schedule;
import com.example.workload.service.interfaces.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schedules")
public class ScheduleRestController {
    @Autowired
    ScheduleService scheduleService;

    @GetMapping("/")
    public List<Schedule> getAll(){
        return scheduleService.getAll();
    }

    @GetMapping("/{id}")
    public Schedule getOne(@PathVariable String id){
        return scheduleService.getOne(id);
    }

    @PostMapping("/")
    public Schedule create(@RequestBody Schedule schedule){
        return scheduleService.create(schedule);
    }

    @PutMapping("/")
    public Schedule update(@RequestBody Schedule schedule){
        return scheduleService.update(schedule);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        scheduleService.delete(id);
    }
}
