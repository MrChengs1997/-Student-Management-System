package com.cr.test.controller;

import com.cr.test.mapper.StudentMapper;
import com.cr.test.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class dataList {

    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/todatalist")
    public String toDataList(Model model){

        //封装所有的学生
        List<Student> stus = studentMapper.getStus();
        model.addAttribute("stus",stus);

        //学生表的个数
        int size = studentMapper.size();
        model.addAttribute("size",size);

        return "dataList";
    }
}
