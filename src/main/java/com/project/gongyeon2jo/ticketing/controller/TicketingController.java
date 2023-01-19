package com.project.gongyeon2jo.ticketing.controller;

import com.project.gongyeon2jo.ticketing.domain.Ticketing;
import com.project.gongyeon2jo.ticketing.dto.TicketingDto;
import com.project.gongyeon2jo.ticketing.service.TicketingService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ticketing")
public class TicketingController {

    public TicketingService ticketingService;

    @GetMapping("")
    public List<TicketingDto> getTicketingList() {
        return ticketingService.getTicketingList();
    }

    @GetMapping("/seat")
    public String Ticketing(Model model) {


        return "ticketing/seat";
    }

}
