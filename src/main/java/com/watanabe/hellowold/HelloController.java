package com.watanabe.hellowold;

import com.watanabe.hellowold.domain.hello.HelloEntity;
import com.watanabe.hellowold.domain.hello.HelloDefinition;
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
                new HelloEntity(HelloDefinition.JP, HelloDefinition.JP.country, HelloDefinition.JP.capital,
                        HelloDefinition.JP.greeting, dateTimeDisplay.dateTimeJapan()),
                new HelloEntity(HelloDefinition.CH, HelloDefinition.CH.country, HelloDefinition.CH.capital,
                        HelloDefinition.CH.greeting, dateTimeDisplay.dateTimeShanghai()),
                new HelloEntity(HelloDefinition.US, HelloDefinition.US.country, HelloDefinition.US.capital,
                        HelloDefinition.US.greeting, dateTimeDisplay.dateTimeUS_Pacific())
        );
        model.addAttribute("helloList", helloList);
        return "hello";
    }
}
