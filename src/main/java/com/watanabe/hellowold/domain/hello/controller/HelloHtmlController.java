package com.watanabe.hellowold.domain.hello.controller;

import com.watanabe.hellowold.DateTimeDisplay;
import com.watanabe.hellowold.domain.hello.HelloEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static com.watanabe.hellowold.domain.hello.Domain.*;
@Controller
public class HelloHtmlController {
    @GetMapping("/hello/list")
    public String helloList(Model model) {
        DateTimeDisplay dateTimeDisplay = new DateTimeDisplay();
        var helloList = List.of(
                new HelloEntity(JP, "日本", "東京", "こんにちは！", dateTimeDisplay.dateTimeJapan()),
                new HelloEntity(CH, "中国", "北京", "你好！", dateTimeDisplay.dateTimeShanghai()),
                new HelloEntity(US, "アメリカ", "ワシントンD.C.", "Hello!", dateTimeDisplay.dateTimeUS_Pacific())
        );
        model.addAttribute("helloList", helloList);
        return "hello_list";
    }
}
