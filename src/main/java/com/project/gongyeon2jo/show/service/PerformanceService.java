package com.project.gongyeon2jo.show.service;

import com.project.gongyeon2jo.show.dto.PerformanceDto;
import com.project.gongyeon2jo.show.entity.Performance;
import com.project.gongyeon2jo.show.model.PerformanceInput;
import com.project.gongyeon2jo.show.repository.PerformanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor // 의존성 주입에 대해 생성자 만들어줌
@Service
public class PerformanceService {

    private final PerformanceRepository performanceRepository;

    // 공연 목록에 공연 추가
    public boolean add(PerformanceInput parameter) {

        Performance performance = Performance.builder()
                .poster(parameter.getPoster()) // db에 파일명 올라가도록
                .build();

        performanceRepository.save(performance);

        return true;
    }

    // 공연 목록 띄우기
    public List<Performance> listAll() {

        List<Performance> list = performanceRepository.findAll();
        return list;
    }

    // 페이징을 적용된 목록 띄우기
    /*@Transactional(readOnly = true)
    public Page<Performance> list(Pageable pageable) {
        return performanceRepository.findAll(pageable);
    }*/
}
