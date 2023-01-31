package com.project.gongyeon2jo.performance.service;

import com.project.gongyeon2jo.performance.entity.Performance;
import com.project.gongyeon2jo.performance.model.PerformanceInput;
import com.project.gongyeon2jo.performance.repository.PerformanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor // 의존성 주입에 대해 생성자 만들어줌
@Service
public class PerformanceService {

    private final PerformanceRepository performanceRepository;

    // 공연 목록에 공연 추가
    public boolean add(PerformanceInput parameter) {

        Performance performance = Performance.builder()
                .poster(parameter.getPoster()) // db에 파일명 올라가도록
                .displayName(parameter.getDisplayName())
                .company(parameter.getCompany())
                .displayId(parameter.getDisplayId())
                .displayDate(parameter.getDisplayDate())
                .price(parameter.getPrice())
                .story(parameter.getStory())
                .announcement(parameter.getAnnouncement())
                .question(parameter.getQuestion())
                .phone(parameter.getPhone())
                .build();

        performanceRepository.save(performance);

        return true;
    }

    // 공연 목록 띄우기
    public List<Performance> listAll() {
        return performanceRepository.findAll(Sort.by(Sort.Direction.DESC, "performanceId"));
    }



    // 공연 상세보기 띄우기
    public boolean detail(int id) {
        //*get 사용하는 이유는 findById가 Optional로 감싸져 있기 때문에 Optional 안에 값 가져오기 위해서*//*
        Optional<Performance> optionalPerformance = performanceRepository.findById(id);

        if (!optionalPerformance.isPresent()) {
            return false;
        }

        return true;
    }
}
