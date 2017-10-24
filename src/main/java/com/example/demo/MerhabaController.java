package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MerhabaController {
  /*  private static final String PATH = "/merhaba";
    @RequestMapping(value = PATH)
    public void merhaba(Model model) {
        String mesajicerigi="Merhaba Dünya";
        model.addAttribute("mesaj", mesajicerigi);
    } */
    @RequestMapping("/merhaba")
    String merhaba() {
        return "merhaba";
    }

}
