package com.gmail.greedy0110.study.tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        //WHAT: 반환은 뷰의 논리적인 이름
        return "home";
    }
}
