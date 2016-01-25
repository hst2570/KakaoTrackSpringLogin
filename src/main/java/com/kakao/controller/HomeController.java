package com.kakao.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
    public String index(HttpSession session) {
        return "user/index";
    }
	
    @RequestMapping("/user/signin/form")
    public String signinForm()  {
        return "user/signin";
    }
    
    @RequestMapping("/user/signup")
    public String signup() {
        return "user/signup";
    }
 
}
