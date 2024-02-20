package com.dev.devProject.testcode.controller;

import com.dev.devProject.testcode.dto.TestCodeRslt;
import com.dev.devProject.testcode.service.TestCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestCodeController {

    private final TestCodeService testCodeService;
    @Autowired
    public TestCodeController(TestCodeService testCodeService) {
        this.testCodeService = testCodeService;
    }
    @GetMapping(value = "/home")
    public String testpage() {
        System.out.println("test gogo");
        return "mainpage/home";
    }
    @GetMapping(value = "/testdb")
    public List<TestCodeRslt> testcode() {
        return testCodeService.getTestcode();
    }
}