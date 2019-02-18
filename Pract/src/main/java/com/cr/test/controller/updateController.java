package com.cr.test.controller;

import com.cr.test.mapper.StudentMapper;
import com.cr.test.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class updateController {

    @Autowired
    StudentMapper studentMapper;

    //跳转页面

    //页面查询后面的修改
    //跳转到指定的修改页面

    @RequestMapping("/toupdate/{id}")
    public  String  toUpdate(@PathVariable("id") String id, Model model){

        Student student = studentMapper.getStuById(id);
        //封装查到的数据
        model.addAttribute("student",student);
        return "update";
    }



    //修改学生
    @RequestMapping("/addStudent")
    public String update(Student student){
        System.out.println(student);

        //修改学生
        studentMapper.updateStu(student);

        return "redirect:/todatalist";
    }
}
