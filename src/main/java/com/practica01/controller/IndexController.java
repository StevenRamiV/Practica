
package com.practica01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
    
     @RequestMapping("/")
    public String page(Model model) {
        model.addAttribute("mensaje", "Test Practica 01");
        return "Index"; //vista guardada en templates NO en static// 
    }
    
    
}
