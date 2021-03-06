package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Admin
 * @Date: 2019/3/19 10:46
 * @Description:
 */
@Controller
public class index {


    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }


    @RequestMapping(value = "/login")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");

        List<String> userList=new ArrayList<>();
        userList.add("admin");
        userList.add("user1");
        userList.add("user2");

        modelAndView.addObject("userList", userList);
        return modelAndView;
    }

}
