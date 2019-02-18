package com.cr.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TeacherMapper {

    //登陆
    public int LoginStu(@Param("name") String name, @Param("pwd") String pwd);
}
