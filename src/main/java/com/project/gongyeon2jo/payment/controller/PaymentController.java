package com.project.gongyeon2jo.payment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/pay")
public class PaymentController {

    @GetMapping("")
    public String payment() {
        return "iamport";
    }

}
