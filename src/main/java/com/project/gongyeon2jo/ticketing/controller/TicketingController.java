package com.project.gongyeon2jo.ticketing.controller;

import com.project.gongyeon2jo.ticketing.model.Ticketing;
import com.project.gongyeon2jo.ticketing.service.TicketingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/ticketing")
public class TicketingController {

    private final TicketingService ticketingService;

    @GetMapping("")
    public ModelAndView getTicketing(Integer performanceId) {
        ModelAndView modelAndView = new ModelAndView();
//        Optional<Performance> performance = performanceService.getPerformance(performanceId);
//        modelAndView.addObject("performance", performance.get());
        modelAndView.setViewName("ticketing/detail");
        return modelAndView;
    }

    @PostMapping("")
    public ModelAndView insert(Ticketing ticketing) {
        ModelAndView modelAndView = new ModelAndView();
        ticketingService.insert(ticketing);
        modelAndView.addObject("ticketing", ticketing);
        modelAndView.setViewName("ticketing/complete");
        return modelAndView;
    }
}