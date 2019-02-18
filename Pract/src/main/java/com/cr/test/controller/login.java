package com.cr.test.controller;

import com.cr.test.mapper.StudentMapper;
import com.cr.test.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class login {



    @Autowired
    StudentMapper studentMapper;

    @Autowired
    TeacherMapper teacherMapper;


    @RequestMapping("/toLogin")
    public String toLogin(String name, String pwd, HttpSession session, Model model){
        System.out.println(name);
        System.out.println(pwd);
        int res = teacherMapper.LoginStu(name,pwd);
        if(res !=1){
            model.addAttribute("msg","账号或者密码错误");
            return "login1";
        }else {
            session.setAttribute("username",name);
            return "redirect:/main";
        }
    }










    //登陆成功跳转的页面
    @RequestMapping("/main")
    public String toMain(){
        return "main";
    }
}
