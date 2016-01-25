package com.kakao.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
//	@RequestMapping("/")
//    public String index() {
//        return "user/index";
//    }
	
    @RequestMapping("/user/signin/form")
    public String signinForm(HttpSession session)  {
    	session.setAttribute("signinFail", null);
        return "user/signin";
    }
    
    @RequestMapping("/user/signup")
    public String signup() {
        return "user/signup";
    }
    
    @RequestMapping("/")
    public String index(HttpSession session){
        return "index";
    }
 
}
