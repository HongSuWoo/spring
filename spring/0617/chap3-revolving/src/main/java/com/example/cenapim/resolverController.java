package com.example.cenapim;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/*")
public class resolverController
{
    @GetMapping("string")
    public String stringReturning(Model model){
        model.addAttribute("message", "문자열로 뷰 이름 변경함.");



        return "result";

    }

    @GetMapping("string-redirect")
    public String stringRedirect()
    {
        return "redirect:/";
    }
    /*
    기본적으로 redirect시에는 재요청이 발생하므로 request scope는 소멸된다.
    하지만 스프릉이세넌 redirecectAttribute타입을 통해 redircet시 속성 값을 저장할수 있도록
    하는 기능을 제공한다
     */
    @GetMapping("string-redirect-attr")
    public String stringRdirectFlashAttribute(RedirectAttributes rttr)
    {
        rttr.addFlashAttribute("flashMessage","리다이렉트 attr 사용하여 redirect..");
        return "redirect:/";
    }
    @GetMapping("modelandview")
    public ModelAndView modelandveiwReturning(ModelAndView mv)
    {
        mv.addObject("forwardMessage","modelandview를 이용한 보델과 뷰 반환");
        mv.setViewName("result");
        return mv;
    }

    @GetMapping("modelandview-redirect")
    public ModelAndView modelAndViewRedirect(ModelAndView mv)
    {
        mv.setViewName("redirect:/");
        return mv;
    }
    @GetMapping("modelandview-redirect-attr")
    public ModelAndView modelAndViewRedirect(ModelAndView mv,RedirectAttributes rttr)
    {
        rttr.addFlashAttribute("flashMessage2","modelandview를 이용한 redirect attr");
        mv.setViewName("redirect:/");
        return mv;
    }

}

html 기본은알아야대고
css
html 태그 의옵션이
html css 
