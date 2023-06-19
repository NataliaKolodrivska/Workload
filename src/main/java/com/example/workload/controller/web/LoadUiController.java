package com.example.workload.controller.web;

import com.example.workload.service.interfaces.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui/v1/loads")
public class LoadUiController {
    @Autowired
    LoadService loadService;

    @RequestMapping("/")
    public String getAll(Model model){
        model.addAttribute("loads", loadService.getAll());
        return "loads";
    }

    @GetMapping("/{id}")
    public String delete(@PathVariable String id){
        loadService.delete(id);
        return "redirect:/ui/v1/loads/";
    }
}
