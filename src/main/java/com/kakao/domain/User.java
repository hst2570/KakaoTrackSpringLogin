package com.kakao.domain;

import javax.persistence.*;
import java.io.Serializable;
 
@Entity //유저 정보를 가지는 테이블?
public class User implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String memId; //순번 ->mem_memId
    
    @Column(name = "email", nullable = false)
    private String email;
 
    @Column(name = "nickname", nullable = false)
    private String nickname;
 
    @Column(name = "password", nullable = false)
    private String password;

	public String getmemId() {
		return memId;
	}

	public void setmemId(String memId) {
		this.memId = memId;
	}
    
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [memId=" + memId + ", email=" + email + ", nickname=" + nickname + ", password=" + password + "]";
	}
}