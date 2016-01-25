package com.kakao.domain;

import javax.persistence.*;
import java.io.Serializable;
 
@Entity
public class User implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    
    @Column(name = "email", nullable = false)
    private String email;
 
    @Column(name = "nickname", nullable = false)
    private String nickname;
 
    @Column(name = "password", nullable = false)
    private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		return "User [id=" + id + ", email=" + email + ", nickname=" + nickname + ", password=" + password + "]";
	}
}