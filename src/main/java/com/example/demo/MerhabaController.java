package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MerhabaController {

    @RequestMapping("/merhaba")
    public void merhaba(Model model) {
        String mesajicerigi="Merhaba Dünya";
        model.addAttribute("mesaj", mesajicerigi);
    }
}
