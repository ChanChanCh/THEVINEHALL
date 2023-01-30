package com.project.gongyeon2jo.ticketing.controller;

import com.project.gongyeon2jo.performance.entity.Performance;
import com.project.gongyeon2jo.performance.service.PerformanceService;
import com.project.gongyeon2jo.ticketing.model.TicketingInput;
import com.project.gongyeon2jo.ticketing.service.TicketingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Slf4j /*에러 화면에 띄우기 위해*/
@RequiredArgsConstructor
@Controller
public class TicketingController {

    private final PerformanceService performanceService;
    private final TicketingService ticketingService;

    @GetMapping("/ticketing/register")
    public String ticketingRegister(Model model, int id) {

        /*detail.price 내려주기 위해서*/
        Performance detail = performanceService.detail(id);
        model.addAttribute("detail", detail);

        return "ticketing/register";
    }

    @PostMapping("/ticketing/register") /*예매하기 버튼 누르면 db에 티켓정보 저장*/
    public String ticketingRegisterAdd(Model model,
                                       int id,
                                       int ticketingQuantity,
                                       String price,
                                       List<String> seats,
                                       TicketingInput parameter) {

        /*외래키 performanceId를 넣어주기 위해서*/
        boolean result = ticketingService.add(id, ticketingQuantity, price, seats, parameter);
        model.addAttribute("result", result);

        return "payment/register";
    }
}