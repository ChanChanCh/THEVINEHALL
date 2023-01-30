package com.project.gongyeon2jo.ticketing.service;

import com.project.gongyeon2jo.performance.entity.Performance;
import com.project.gongyeon2jo.performance.repository.PerformanceRepository;
import com.project.gongyeon2jo.ticketing.entity.Ticketing;
import com.project.gongyeon2jo.ticketing.model.TicketingInput;
import com.project.gongyeon2jo.ticketing.repository.TicketingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor // 의존성 주입에 대해 생성자 만들어줌
@Service
public class TicketingService {

    private final TicketingRepository ticketingRepository;
    private final PerformanceRepository performanceRepository;

    // 티켓 테이블에 티켓 데이터 추가
    public boolean add(int id, int ticketingQuantity, String price,
                       List<String> seats, TicketingInput parameter) {


        Performance performance = performanceRepository.findById(id).get();

        Ticketing ticketing = Ticketing.builder()
                .price(price)
                .ticketingQuantity(ticketingQuantity)
                .ticketingDate(LocalDate.now())
                .performance(performance)
                .userId(parameter.getUserId())
                .seats(seats)
                .build();

        ticketingRepository.save(ticketing);

        return true;
    }
}
