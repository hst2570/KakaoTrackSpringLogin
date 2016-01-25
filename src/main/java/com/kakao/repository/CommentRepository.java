package com.kakao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kakao.domain.Comment;

/**
 * Created by HSH on 2016. 1. 13..
 */
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
