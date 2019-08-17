package com.manalangjames.freshvotesapplication.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping({"", "/index","/index.html"})
    public String home() {
        return "index";
    }

}
