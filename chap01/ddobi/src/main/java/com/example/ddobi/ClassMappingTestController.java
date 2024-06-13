package com.example.ddobi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
클래스 레벨에 @requestmapping 이노테이션 사용이 가능하다.
클래스 레벨에 url을 공통 부분을 이용해 설정하고 나면 매번 핸들러 메소드에 url의 중복되는 내용은 작성하지 않아도 된다.
이 #때 와일드 카드를 이용해서 족므 더 포괄적인 url 패턴을 설정 할 수 있다.
 */
@Controller
@RequestMapping("/orders/*")
public class ClassMappingTestController {

    @GetMapping("/regist")
    public String registOrder(Model model) {
        model.addAttribute("message", "get 방식의 주문 등록용 핸들러 메소드를 호출함");
        return "mappingResult";
    }
// 여러갱릐 패턴 매핑
    // value 속성에 중괄호를 이ㅏ용해 매핑할 url 을 나타낸대;
    @RequestMapping(value ={"modify", "delete"}, method = RequestMethod.POST)
    public String modifyAndDelete(Model model){
        model.addAttribute("message", "post 방식의 주문 등록용 핸들러 메소드를 호출함");
        return "mappingResult";
    }

}
