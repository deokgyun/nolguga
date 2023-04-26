package com.an.dg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/hello")
    public String home(Model model){

        model.addAttribute("hello", "서버에서 받았당");
        return "home";
    }
}
