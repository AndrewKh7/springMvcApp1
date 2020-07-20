package ru.khrapkov.springMVCApp.beans.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(){
       return "first/hello"; // то есть файл лежит в папке first
    }

    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "first/goodbye";
    }

}
