package com.cr.test.controller;

import com.cr.test.mapper.StudentMapper;
import com.cr.test.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class addController {



    @RequestMapping("/add")
    public String add(){
        return "addUpdaate";
    }

    @Autowired
    StudentMapper studentMapper;

    //添加学生成功并且返回
    @RequestMapping("/addStu")
    public String addStudentSus(Student student){

        //添加学生
        studentMapper.addStudents(student);
        System.out.println(student);
        return "redirect:/todatalist";
    }





}
