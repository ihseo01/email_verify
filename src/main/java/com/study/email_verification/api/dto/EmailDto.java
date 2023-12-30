package com.study.email_verification.api.dto;

import lombok.Data;

@Data
public class EmailDto {

    // 이메일 주소
    private String mail;
    // 인증 코드
    private int verifyCode;
}
