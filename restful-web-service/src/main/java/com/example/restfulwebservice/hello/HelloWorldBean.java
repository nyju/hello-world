package com.example.restfulwebservice.hello;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor // Default 생성자가 같이 생성됨
public class HelloWorldBean {
    private String message;

}
