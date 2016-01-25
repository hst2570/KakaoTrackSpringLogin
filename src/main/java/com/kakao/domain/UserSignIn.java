package com.kakao.domain;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

//로그인 시도시 입력된 값을 저장하는 임시 저장소
public class UserSignIn {
	@NotEmpty @Size (min=4, max=20)
	private String email;
	@NotEmpty @Size (min=4, max=20)
	private String password;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserSignIn [email=" + email + ", password=" + password + "]";
	}
	
}
