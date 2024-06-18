package com.example.cenapim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class mainController
{
    @RequestMapping(value = {"/"})
    public String main()
    {
        return "main";
    }

    @RequestMapping(value  ="/main")
    public void mainpage(){}
}
