package com.project.gongyeon2jo.performance.model;

import lombok.Data;

@Data // getter, setter 사용
public class PerformanceInput {

    // id는 자동 증가됨!!
    // add 목적, db에 파일명 올라가도록
    String poster; // 포스터 이미지
    String displayName; // 공연명
    String company; // 제작사
    String displayId; // 공연시설
    String displayDate; // 공연일
    String price; // 티켓 가격
    String story; // 공연소개
    String announcement; // 공지사항
    String question; // 예매 문의
    String phone; // 문의 연락처

}
