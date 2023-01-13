package com.project.gongyeon2jo.show.model;

import lombok.Data;

@Data // getter, setter 사용
public class PerformanceInput {

    // id는 자동 증가됨!!
<<<<<<< HEAD
    // add 목적, db에 파일명 올라가도록
    String poster; // 포스터 이미지

=======
    String prfperiod; // 공연기간
    String category; // 장르
    String prfplacename; // 공연장
    String prfname; // 공연명
    String seatcnt; // 좌석수

    // add 목적, db에 파일명 올라가도록
    String poster; // 포스터 이미지
>>>>>>> parent of 964b28c (Revert "포스터 파일명 커밋")
}
