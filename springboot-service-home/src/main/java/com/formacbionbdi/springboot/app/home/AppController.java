package com.formacbionbdi.springboot.app.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    
    @GetMapping("/home")
    public String verPaginaDeInicio(){
        return "index";
    }
}
