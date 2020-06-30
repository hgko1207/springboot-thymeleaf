package com.hgko.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
    public String index(Model model) {
		 return "redirect:home";
    }
	
	@GetMapping("/home")
    public String home(Model model) {
        return "home";
    }
}
