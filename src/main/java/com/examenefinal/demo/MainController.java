package com.examenefinal.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/main")

public class MainController {

    @GetMapping("/Index")

    public String Index(){

        return "Vienvenidos a la lavanderia";
    }
}
