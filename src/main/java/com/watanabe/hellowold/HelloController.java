package com.watanabe.hellowold;

import com.watanabe.hellowold.DateTimeDisplay;
import com.watanabe.hellowold.domain.hello.HelloEntity;
import com.watanabe.hellowold.domain.hello.HelloId;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HelloController {
    @GetMapping("/hello")

    public String helloList(Model model) {
        DateTimeDisplay dateTimeDisplay = new DateTimeDisplay();
        var helloList = List.of(
                new HelloEntity(HelloId.JP, HelloId.JP.country, HelloId.JP.capital,
                        HelloId.JP.greeting, dateTimeDisplay.dateTimeJapan()),
                new HelloEntity(HelloId.CH, HelloId.CH.country, HelloId.CH.capital,
                        HelloId.CH.greeting, dateTimeDisplay.dateTimeShanghai()),
                new HelloEntity(HelloId.US, HelloId.US.country, HelloId.US.capital,
                        HelloId.US.greeting, dateTimeDisplay.dateTimeUS_Pacific())
        );
        model.addAttribute("helloList", helloList);
        return "hello";
    }
}
