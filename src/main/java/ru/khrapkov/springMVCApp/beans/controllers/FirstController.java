package ru.khrapkov.springMVCApp.beans.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

@Controller
@RequestMapping("/first") // все запросы должны будут начинаться с /first (например /first/hello)
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request, Model model){
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        model.addAttribute("message","Hello, " + name + " " + surname);
        return "first/hello"; // то есть файл лежит в проекте в папке views/first
    }

    @GetMapping("/goodbye")
    public String goodbyePage(@RequestParam( required=false) String name,
                              @RequestParam( required=false) String surname){
        System.out.println(name);
        System.out.println(surname);
        return "first/goodbye"; // то есть файл лежит в проектк в папке views/first
    }

}

