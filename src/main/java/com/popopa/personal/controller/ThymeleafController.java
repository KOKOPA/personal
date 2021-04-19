package com.popopa.personal.controller;

import com.popopa.personal.model.Test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
    
    @RequestMapping("/move")
    public Model test(@ModelAttribute Test param, Model model) {
        model.addAttribute("data", param);
        return model;
    }
}
