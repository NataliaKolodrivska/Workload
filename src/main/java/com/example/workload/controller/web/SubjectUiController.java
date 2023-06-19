package com.example.workload.controller.web;

import com.example.workload.service.interfaces.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui/v1/subjects")
public class SubjectUiController {
    @Autowired
    SubjectService subjectService;

    @RequestMapping("/")
    public String getAll(Model model){
        model.addAttribute("subjects", subjectService.getAll());
        return "subjects";
    }

    @GetMapping("/{id}")
    public String delete(@PathVariable String id){
        subjectService.delete(id);
        return "redirect:/ui/v1/subjects/";
    }
}
