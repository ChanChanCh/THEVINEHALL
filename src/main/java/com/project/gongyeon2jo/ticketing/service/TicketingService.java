package com.project.gongyeon2jo.ticketing.service;

import com.project.gongyeon2jo.ticketing.repository.TicketingRepository;
import com.project.gongyeon2jo.ticketing.model.Ticketing;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TicketingService {

    private final TicketingRepository ticketingRepository;

    @Transactional
    public void insert(Ticketing ticketing) {
        ticketing.setTicketingDate(LocalDateTime.now());
        ticketingRepository.save(ticketing);
    }

}
