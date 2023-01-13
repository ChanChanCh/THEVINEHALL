package com.project.gongyeon2jo.show.dto;

import com.project.gongyeon2jo.show.entity.Performance;
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

    String id; // id
    String prfperiod; // 공연기간
    String category; // 장르
    String prfplacename; // 공연장
    String prfname; // 공연명
    String seatcnt; // 좌석수
    String poster; // 포스터 이미지

    // of 메서드 : ShowEntity 를 받아서 ShowDto 로 리턴해줌
    public static PerformanceDto of(Performance performance) {
        return PerformanceDto.builder()
                .id(performance.getId())
                .prfperiod(performance.getPrfperiod())
                .category(performance.getCategory())
                .prfplacename(performance.getPrfplacename())
                .prfname(performance.getPrfname())
                .seatcnt(performance.getSeatcnt())
                .poster(performance.getPoster())
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
