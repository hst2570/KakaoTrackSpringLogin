package com.kakao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by HSH on 2016. 1. 13..
 */
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    
    @Column(name = "studyId", nullable = false)
    private Integer studyId;
    
    @Column(name = "memId", nullable = false)
    private Integer memId;
    
    @Column(name = "description", nullable = false)
    private String description;
    
    @Column(name = "likeCount", nullable = false)
    private Integer likeCount;

    public Comment(){
        likeCount = 0;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getStudyId() {
        return studyId;
    }

    public void setStudyId(Integer studyId) {
        this.studyId = studyId;
    }

    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }
}