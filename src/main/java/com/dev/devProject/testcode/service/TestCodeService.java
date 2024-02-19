package com.dev.devProject.testcode.service;

import com.dev.devProject.testcode.mapper.TestCodeMapper;
import com.dev.devProject.testcode.vo.TestCodeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestCodeService {

    private final TestCodeMapper testCodeMapper;
    @Autowired
    public TestCodeService(TestCodeMapper testCodeMapper) {
        this.testCodeMapper = testCodeMapper;
    }

    public List<TestCodeVO> getTestcode() {
        return testCodeMapper.getTestcode();
    }

}
