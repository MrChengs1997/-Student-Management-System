package com.cr.test.controller;

import com.cr.test.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class deleteController {

    @Autowired
    StudentMapper studentMapper;

    //单个删除用户url
    @RequestMapping("/delete/{id}")
    public  String listChecked(@PathVariable("id") String id){
        System.out.println(id);

        //删除员工
        studentMapper.deleteStuById(id);
        return "redirect:/todatalist";
    }
}
