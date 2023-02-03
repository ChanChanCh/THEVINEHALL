package com.project.gongyeon2jo.member.model;


import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Data
public class MemberInput {

    private String userId;              //아이디
    private String email;               // 이메일
    private String name;                // 이름
    private String password;            // 패스워드
    private LocalDateTime birth;        // 생년월일
    private String phone;               // 휴대전화

}
