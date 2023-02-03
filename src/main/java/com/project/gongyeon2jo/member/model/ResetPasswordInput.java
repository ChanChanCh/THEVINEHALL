package com.project.gongyeon2jo.member.model;


import lombok.Data;
import lombok.ToString;

@ToString
//자동으로 getter setter 지원
@Data
public class ResetPasswordInput {

    private String userId;
    private String Name;

    private String id; // 파라미터
    private String password;

}
