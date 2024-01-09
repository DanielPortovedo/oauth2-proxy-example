package com.example.webapplicationexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class UserController {

    @GetMapping("/")
    public String index(@RequestHeader(value = "X-Forwarded-Access-Token", required = false) String accessToken,
                        @RequestHeader(value = "X-Forwarded-Preferred-Username", required = false) String username,
                        Model model){

        model.addAttribute("username", username);
        model.addAttribute("accessToken", accessToken);
        return "index";
    }

}
