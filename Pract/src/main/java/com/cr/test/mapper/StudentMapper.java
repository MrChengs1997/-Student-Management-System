package com.cr.test.mapper;

import com.cr.test.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentMapper {

    //登陆
    public int LoginStu(@Param("name") String name,@Param("pwd") String pwd);

    //查询所有的学生
    public List<Student> getStus();

    //添加学生
    public  void addStudents(Student student);

    //删除单个学生
    public void deleteStuById(String id);

    //根据id查询一个Student
    public Student getStuById(String id);

    //更新学生信息
    public  void updateStu(Student student);

    //查询个数
    public  int size();

}
