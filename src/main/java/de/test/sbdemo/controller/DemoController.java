package de.test.sbdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DemoController {

    char c = '\u2654';
    private String message = "message: " + c;
    private int count=0;

    @RequestMapping("/test")
    public String test(Model model){
        count++;
        model.addAttribute("message", message);
        model.addAttribute("count", count);
        return "test";
    }

    @RequestMapping("/")
    public String welcome(){
        return "welcome";
    }
}
