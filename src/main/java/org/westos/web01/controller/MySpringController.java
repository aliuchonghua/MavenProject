package org.westos.web01.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.westos.web01.bean.Student;

/**
 * Created by Administrator on 2018/8/28.
 */
@RequestMapping("/spring")
@Controller
public class MySpringController {

    @RequestMapping("/hello")
    public ModelAndView hello(Student stu){
        ModelAndView mv=new ModelAndView();
        mv.addObject("name","你好helloc");
        mv.addObject("stu",stu);
        mv.setViewName("/hello");

        return mv;
    }
}
