package com.study.email_verification.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // 이메일 인증 화면 호출
    @GetMapping("/emailSend")
    public String emailSend() {
        return "emailSend";
    }
}
