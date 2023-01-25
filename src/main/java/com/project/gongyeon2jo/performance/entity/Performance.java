package com.project.gongyeon2jo.performance.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Performance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int performanceId; // id
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
