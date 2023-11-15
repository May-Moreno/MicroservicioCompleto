package com.formacionbdi.springboot.app.patient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    
    @GetMapping
    public String seeHomePage()
    {
        return "index";
    }
}
