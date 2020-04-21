package com.example.demo_spring_jpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class AppController {
    @RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }
}
