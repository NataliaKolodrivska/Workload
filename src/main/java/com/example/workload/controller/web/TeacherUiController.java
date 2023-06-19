package com.example.workload.controller.web;

import com.example.workload.service.interfaces.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui/v1/teachers")
public class TeacherUiController {
    @Autowired
    TeacherService teacherService;

    @RequestMapping("/")
    public String getAll(Model model){
        model.addAttribute("teachers", teacherService.getAll());
        return "teachers";
    }

    @GetMapping("/{id}")
    public String delete(@PathVariable String id){
        teacherService.delete(id);
        return "redirect:/ui/v1/teachers/";
    }
}
