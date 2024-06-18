package com.example.cenapim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class manSecondController
{

    @GetMapping("/second")
    public ModelAndView second(ModelAndView mv, @RequestParam("data2") String value)
    {
        mv.addObject("data2", value);
        mv.setViewName("second");
        return mv;
    }


}
