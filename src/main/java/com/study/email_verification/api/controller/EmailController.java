package com.study.email_verification.api.controller;

import com.study.email_verification.api.dto.EmailDto;
import com.study.email_verification.api.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/email")
public class EmailController {
    private final EmailService emailService;

    // 인증코드 메일 발송
    @PostMapping("/send")
    public String mailSend(EmailDto emailDto) {
        log.debug("EmailController.mailSend()");
        int number = emailService.sendMail(emailDto.getMail());
        return String.valueOf(number);
    }

    // 인증코드 인증
    @PostMapping("/verify")
    public String verify() {
        return "인증이 완료되었습니다.";
    }
}
