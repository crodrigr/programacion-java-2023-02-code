package co.edu.uts.appdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/index","/","","/home"})
    public String index(Model model){
        return "index";
    }
    
}
