package com.watanabe.hellowold.domain.hello.controller;

import com.watanabe.hellowold.DateTimeDisplay;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    DateTimeDisplay dateTimeDisplay = new DateTimeDisplay();
    @GetMapping("/hello/JPN")
    public String hello() {
        return "こんにちは！" + "  " + dateTimeDisplay.dateTimeJapan();
    }
    @GetMapping("/hello/CST")
    public String hello2() {
        return "你好！" + "  " + dateTimeDisplay.dateTimeShanghai();
    }

    @GetMapping("/hello/USP")
    public String hello3() {
        return "Hello!" + "  " + dateTimeDisplay.dateTimeUS_Pacific();
    }
}