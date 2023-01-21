package com.project.gongyeon2jo.practice;

import com.project.gongyeon2jo.performance.entity.Performance;
import com.project.gongyeon2jo.performance.model.PerformanceInput;
import com.project.gongyeon2jo.performance.repository.PerformanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor // 의존성 주입에 대해 생성자 만들어줌
@Service
public class PracticeService {

    private final PracticeRepository practiceRepository;
    private final PracticeRepository2 practiceRepository2;

    // data 추가
    public boolean add(PracticeInput parameter) {

        Practice practice = Practice.builder()
                .displayName(parameter.getDisplayName())
                .price(parameter.getPrice())
                .build();

        practiceRepository.save(practice);

        return true;
    }

    // 리스트
    public List<Practice> listAll() {
        List<Practice> list = practiceRepository.findAll();
        return list;
    }

    public Practice detail(int id) {
        Practice detail = practiceRepository.findById(id).get();
        return detail;
    }

    // data 추가
    public boolean add2(PracticeInput2 parameter, int id) {

        Practice practice = practiceRepository.findById(id).get();

        Practice2 practice2 = Practice2.builder()
                .practice(practice)
                .ticketQuantity(parameter.getTicketQuantity())
                .build();

        /*practice2.setPractice(practice);*/


        practiceRepository2.save(practice2);
        return true;
    }


}