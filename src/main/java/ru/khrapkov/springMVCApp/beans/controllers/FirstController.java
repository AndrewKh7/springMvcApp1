package ru.khrapkov.springMVCApp.beans.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first") // все запросы должны будут начинаться с /first (например /first/hello)
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(){
       return "first/hello"; // то есть файл лежит в проектк в папке views/first
    }

    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "first/goodbye"; // то есть файл лежит в проектк в папке views/first
    }

}
