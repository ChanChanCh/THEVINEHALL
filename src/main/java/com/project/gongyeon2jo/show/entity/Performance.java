package com.project.gongyeon2jo.show.entity;

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
    String id; // id
<<<<<<< HEAD
    String poster; // 포스터 이미지

=======

    String prfperiod; // 공연기간
    String category; // 장르
    String prfplacename; // 공연장
    String prfname; // 공연명
    String seatcnt; // 좌석수
    String poster; // 포스터 이미지
>>>>>>> parent of 964b28c (Revert "포스터 파일명 커밋")
}
