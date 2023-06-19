package com.example.workload.controller.web;

import com.example.workload.service.interfaces.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui/v1/schedules")
public class ScheduleUiController {
    @Autowired
    ScheduleService scheduleService;

    @RequestMapping("/")
    public String getAll(Model model){
        model.addAttribute("schedules", scheduleService.getAll());
        return "schedules";
    }

    @GetMapping("/{id}")
    public String delete(@PathVariable String id){
        scheduleService.delete(id);
        return "redirect:/ui/v1/schedules/";
    }
}
