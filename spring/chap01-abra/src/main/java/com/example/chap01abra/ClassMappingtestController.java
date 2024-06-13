package com.example.chap01abra;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/orders")

public class ClassMappingtestController {

    @GetMapping("/")
    public String registOrder()
    {
        return "hollow";

    }


}
