package com.pinet.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @ResponseBody
    @GetMapping("/helow")
    public String hello() {
        String env = System.getenv("ENV");
        return " Hello World on "+env;
    }

}
