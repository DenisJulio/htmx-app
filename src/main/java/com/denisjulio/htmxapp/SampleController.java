package com.denisjulio.htmxapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SampleController {

    @GetMapping("/")
    public String getHome() {
        return "index";
    }

    @PostMapping("/clicked")
    public String click() {
        return "htmx :: swapoon";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "htmx :: message";
    }
}
