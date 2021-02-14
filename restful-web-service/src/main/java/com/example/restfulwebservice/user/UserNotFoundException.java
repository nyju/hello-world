package com.example.restfulwebservice.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// HTTP Status Code
// 2XX -> OK
// 4XX -> Client 측 적절하지 않은 요청(존재하지 않는 리소스, 권한 등)
// 5XX -> Server 측 문제(프로그램상 문제, 리소스 연결 문제 등)
@ResponseStatus(HttpStatus.NOT_FOUND) // 400번대 오류로 전송하기 위해
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
