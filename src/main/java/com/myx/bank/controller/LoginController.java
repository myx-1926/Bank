package com.myx.bank.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {
    @GetMapping("index")//页面的url地址
    public String getindex(Model model)//对应函数
    {
        model.addAttribute("name","bigsai");
        return "in";//与templates中index.html对应
    }
}