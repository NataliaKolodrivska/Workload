package com.example.workload.controller.web;

import com.example.workload.service.interfaces.LoadArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui/v1/load-archives")
public class LoadArchiveUiController {
    @Autowired
    LoadArchiveService loadArchiveService;

    @RequestMapping("/")
    public String getAll(Model model){
        model.addAttribute("load-archives", loadArchiveService.getAll());
        return "load-archives";
    }

    @GetMapping("/{id}")
    public String delete(@PathVariable String id){
        loadArchiveService.delete(id);
        return "redirect:/ui/v1/load-archives/";
    }
}
