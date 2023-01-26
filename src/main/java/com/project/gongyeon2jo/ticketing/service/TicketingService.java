package com.project.gongyeon2jo.ticketing.service;

import com.project.gongyeon2jo.ticketing.repository.TicketingRepository;
import com.project.gongyeon2jo.ticketing.model.Ticketing;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class TicketingService {

    private final TicketingRepository ticketingRepository;

    @Transactional
    public void insert(Ticketing ticketing) {
        ticketingRepository.save(ticketing);
    }

}
