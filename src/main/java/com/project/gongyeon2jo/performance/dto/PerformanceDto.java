package com.project.gongyeon2jo.performance.dto;

import com.project.gongyeon2jo.performance.entity.Performance;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PerformanceDto {

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

    // of 메서드 : PerformanceEntity 를 받아서 PerformanceDto 로 리턴해줌
    public static PerformanceDto of(Performance performance) {
        return PerformanceDto.builder()
                .performanceId(performance.getPerformanceId())
                .poster(performance.getPoster())
                .displayName(performance.getDisplayName())
                .company(performance.getCompany())
                .displayId(performance.getDisplayId())
                .displayDate(performance.getDisplayDate())
                .price(performance.getPrice())
                .story(performance.getStory())
                .announcement(performance.getAnnouncement())
                .question(performance.getQuestion())
                .phone(performance.getPhone())
                .build();
    }

    // 공연 목록 띄우기
    public static List<PerformanceDto> of(List<Performance> performances) {

        if (performances == null) {
            return null;
        }

        List<PerformanceDto> performanceList = new ArrayList<>();
        for (Performance x : performances) {
            performanceList.add(PerformanceDto.of(x)); /*위에 있는 of 메서드 호출*/
        }
        return performanceList;
    }
}
