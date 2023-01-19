package com.project.gongyeon2jo.ticketing.service;

import com.project.gongyeon2jo.ticketing.domain.Ticketing;
import com.project.gongyeon2jo.ticketing.dto.TicketingDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TicketingService {
    List<TicketingDto> getTicketingList();

    void insert();

    void update();

    void delete();
}



