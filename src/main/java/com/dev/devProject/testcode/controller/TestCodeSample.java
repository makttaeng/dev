package com.dev.devProject.testcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestCodeSample {

    @GetMapping(value = "/testpage")
    public String testpage() {
        System.out.println("test gogo");
        return "testpage";
    }
}
