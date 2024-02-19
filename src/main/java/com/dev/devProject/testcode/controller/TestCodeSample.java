package com.dev.devProject.testcode.controller;

import com.dev.devProject.testcode.service.TestCodeService;
import com.dev.devProject.testcode.vo.TestCodeVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestCodeSample {

    private final TestCodeService testCodeService;

    public TestCodeSample(TestCodeService testCodeService) {
        this.testCodeService = testCodeService;
    }

    @GetMapping(value = "/home")
    public String testpage() {
        System.out.println("test gogo");
        return "mainpage/home";
    }

    @GetMapping(value = "/testdb")
    public List<TestCodeVO> testcode() {
        return testCodeService.getTestcode();
    }
}
