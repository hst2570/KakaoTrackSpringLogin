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
    	/*
    	 * 가입된 모든 유저 정보를 보여준다.
    	 */
        return userRepository.findAll();
    }
    
    @RequestMapping(value="/user", method=RequestMethod.POST)
	public String write(User user) {
    	/*
    	 * 회원가입 시 받아온 데이터를 저장.
    	 */
    	System.out.println(user.toString());
    	userRepository.save(user);
		return "user/index";
	}
        
    @RequestMapping(value="/user/signin", method=RequestMethod.POST)
    public String signin(UserSignIn signin, HttpSession session)  {
    	/*
    	 * 로그인 시도 값을 받아 로그인 데이터와 비교.
    	 * 로그인이 성공된다면 세션에 mem_id를 넣는다.
    	 * 로그인 실패라면 다시 로그인창으로 이동 -> 로그인실패 시 실패 이벤트 처리 없음. 만들어야함
    	 */
    	List<User> user =  userRepository.findAll();
    	
    	for(int i = 0; i < user.size(); i++){
    		if(user.get(i).getEmail().equals(signin.getEmail())
    				&& user.get(i).getPassword().equals(signin.getPassword())){
        		System.out.println("로그인 성공");
        		
        		session.setAttribute("userId", user.get(i).getmemId());
        		
        		return "user/index"; 
        	}
    	}
    	
    	System.out.println("로그인 실패");
    	session.setAttribute("userId", "fail");
        return "user/signin"; 
    }
    
    @RequestMapping("/user/signout")
    public String signout(HttpSession session)  {
    	/*
    	 * 로그아웃 클릭 시 세션에 id값을 null로 초기화
    	 */
		session.setAttribute("userId", null);
		System.out.println("로그아웃");
		return "user/index"; 
         
    }
}