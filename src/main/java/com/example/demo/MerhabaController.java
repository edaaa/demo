package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MerhabaController {

   /* @RequestMapping("/merhaba")
    public void merhaba(Model model) {
        String mesajicerigi="Merhaba Dünya";
        model.addAttribute("mesaj", mesajicerigi);*/
    //}
    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Reader !!");
        return "index";
    }
    @RequestMapping(value={"/","merhaba"})
    public String home(){
        return "merhaba";
    }

    @RequestMapping("/next")
    public String next(Map<String, Object> model) {
        model.put("message", "You are in new page !!");
        return "next";
    }
}
