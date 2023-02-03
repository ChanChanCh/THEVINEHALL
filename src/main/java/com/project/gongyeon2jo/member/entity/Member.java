package com.project.gongyeon2jo.member.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Member {

    @Id
    private String userId;              //아이디 (메일)

    private String name;                // 이름
    private String password;            // 패스워드
    private String phone;               // 휴대전화
    private LocalDateTime create_dt;          //회원가입일자 (regDt)

    private String emailAuthKey;              //메일인증코드 emailAuthKey
    private boolean emailAuthYn;              //메일인증여부 emailAuthYn
    private LocalDateTime emailAuthDt;       //인증코드유효기간

    private String credit_id;                    //크레딧아이디
    private String review_id;                    //리뷰아이디
    private String ticketing_id;                 //예매아이디

    private String resetPasswordKey;                // 비밀번호 초기화
    private  LocalDateTime resetPasswordLimitDt;


}