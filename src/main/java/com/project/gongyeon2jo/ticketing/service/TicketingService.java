package com.project.gongyeon2jo.ticketing.service;

import com.project.gongyeon2jo.performance.entity.Performance;
import com.project.gongyeon2jo.performance.repository.PerformanceRepository;
import com.project.gongyeon2jo.ticketing.entity.Ticketing;
import com.project.gongyeon2jo.ticketing.model.TicketingInput;
import com.project.gongyeon2jo.ticketing.repository.TicketingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@RequiredArgsConstructor // 의존성 주입에 대해 생성자 만들어줌
@Service
public class TicketingService {

    private final TicketingRepository ticketingRepository;
    private final PerformanceRepository performanceRepository;

    // 공연 목록에 공연 추가
    public boolean add(int id, TicketingInput parameter) {

        Performance performance = performanceRepository.findById(id).get();

        Ticketing ticketing = Ticketing.builder()
                .price(parameter.getPrice())
                .ticketingQuantity(parameter.getTicketingQuantity())
                .ticketingDate(LocalDate.now())
                .performance(performance)
                .userId(parameter.getUserId())
                .build();

        ticketingRepository.save(ticketing);

        return true;
    }
}
