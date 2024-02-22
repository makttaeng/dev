package com.dev.devProject.testcode.controller;

import com.dev.devProject.testcode.dto.TestCodeDto;
import com.dev.devProject.testcode.service.TestCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<TestCodeDto>> testcode() {
        List<TestCodeDto> codeDto =  testCodeService.getTestcode();
        return new ResponseEntity<>(codeDto, HttpStatus.OK);
    }
}
