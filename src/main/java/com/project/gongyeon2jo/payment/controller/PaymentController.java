package com.project.gongyeon2jo.payment.controller;

import com.project.gongyeon2jo.performance.entity.Performance;
import com.project.gongyeon2jo.performance.model.PerformanceInput;
import com.project.gongyeon2jo.performance.service.PerformanceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Slf4j /*에러 화면에 띄우기 위해*/
@RequiredArgsConstructor
@Controller
public class PaymentController {

    private final PerformanceService performanceService;

    @GetMapping("/payment/ticketing")
    public String ticketing() {
        return "payment/ticketing";
    }

    @GetMapping("/payment/start")
    public String paymentStart() {
        return "payment/payment";
    }

    @GetMapping("/payment/success")
    public String paymentSuccess() {
        return "payment/success";
    }

    @GetMapping("/payment/fail")
    public String paymentFail() {
        return "payment/fail";
    }
}