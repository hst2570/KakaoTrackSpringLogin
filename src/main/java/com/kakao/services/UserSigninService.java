package com.kakao.services;

import javax.servlet.http.HttpSession;

import com.kakao.domain.UserSignIn;

public interface UserSigninService {
	public String signin(UserSignIn signin, HttpSession session);
}
