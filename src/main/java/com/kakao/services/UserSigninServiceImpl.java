package com.kakao.services;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.kakao.domain.User;
import com.kakao.domain.UserSignIn;
import com.kakao.repository.UserRepository;

public class UserSigninServiceImpl implements UserSigninService {
	
	@Autowired private UserRepository userRepository;
	
    public String signin(UserSignIn signin, HttpSession session)  {
//    	/*
//    	 * 로그인 시도 값을 받아 로그인 데이터와 비교.
//    	 * 로그인이 성공된다면 세션에 mem_id를 넣는다.
//    	 * 로그인 실패라면 다시 로그인창으로 이동
//    	 * 모든 회원정보를 가져와 들어온 데이터와 비교. 효율성 떨어짐.
//    	 */
//    	session.setAttribute("signinFail", null);
//    	List<User> user =  userRepository.findAll();
//    	
//    	for(int i = 0; i < user.size(); i++){
//    		if(user.get(i).getEmail().equals(signin.getEmail())
//    			&& user.get(i).getPassword().equals(signin.getPassword())){
//        		System.out.println("로그인 성공");
//        		
//        		session.setAttribute("userId", user.get(i).getmemId());
//        		
//        		return "index";
//        	}
//    	}
//    	
//    	System.out.println("로그인 실패");
//    	session.setAttribute("signinFail", "fail");
        return "user/signin";
    }
}
