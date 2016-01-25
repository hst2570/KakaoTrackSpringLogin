package com.kakao.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kakao.domain.User;
import com.kakao.domain.UserSignIn;
import com.kakao.repository.UserRepository;
 
@Controller
public class MainController {
 
    @Autowired private UserRepository userRepository;
    
    @RequestMapping("/user/list")
    public @ResponseBody List<User> getUserList() {
        return userRepository.findAll();
    }
    
    @RequestMapping(value="/user", method=RequestMethod.POST)
	public String write(User user) {
    	System.out.println(user.toString());
    	userRepository.save(user);
		return "user/index";
	}
        
    @RequestMapping(value="/user/signin", method=RequestMethod.POST)
    public String signin(UserSignIn signin, HttpSession session)  {
    	List<User> user =  userRepository.findAll();
    	
    	for(int i = 0; i < user.size(); i++){
    		if(user.get(i).getEmail().equals(signin.getEmail())
    				&& user.get(i).getPassword().equals(signin.getPassword())){
        		System.out.println("로그인 성공");
        		
        		session.setAttribute("userId", user.get(i).getId());
        		
        		return "user/index"; 
        	}
    	}
    	
    	System.out.println("로그인 실패");
        return "user/signin"; 
    }
    
    @RequestMapping("/user/signout")
    public String signout(HttpSession session)  {
		session.setAttribute("userId", null);
		System.out.println("로그아웃");
		return "user/index"; 
         
    }
}