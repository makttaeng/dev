package com.dev.devProject.testcode.mapper;

import com.dev.devProject.testcode.vo.TestCodeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestCodeMapper {
    List<TestCodeVO> getTestcode() ;
}
