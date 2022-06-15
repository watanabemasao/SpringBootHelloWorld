package com.watanabe.hellowold;

import com.watanabe.hellowold.domain.hello.HelloEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static com.watanabe.hellowold.domain.hello.HelloDefinition.*;
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String helloList(Model model) {
        DateTimeDisplay dateTimeDisplay = new DateTimeDisplay();
        var helloList = List.of(
                new HelloEntity(JP, JP.getCapital(), JP.getCountry(), JP.getGreeting(), dateTimeDisplay.dateTimeJapan()),
                new HelloEntity(CH, CH.getCapital(), CH.getCountry(), CH.getGreeting(), dateTimeDisplay.dateTimeShanghai()),
                new HelloEntity(US, US.getCapital(), US.getCountry(), US.getGreeting(), dateTimeDisplay.dateTimeUS_Pacific())
        );
        model.addAttribute("helloList", helloList);
        return "hello";
    }
}
