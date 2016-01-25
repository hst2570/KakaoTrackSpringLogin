package com.kakao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kakao.domain.User;
 
public interface UserRepository extends JpaRepository<User, Long> {

	User findById(String string);
}
