package com.example.restfulwebservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor // 모든생성자
@NoArgsConstructor // default 생성자
public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String details;



}
