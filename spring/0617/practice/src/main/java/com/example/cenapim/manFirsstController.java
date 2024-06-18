package com.example.cenapim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class manFirsstController
{
    @RequestMapping(value = {"/"})
    public String main()
    {
        return "main";
    }

    @RequestMapping(value = {"/first"})
    public void first()
    {

    }
//    @RequestMapping(value = {"/firstre"})
//    public String firstRe()
//


}
