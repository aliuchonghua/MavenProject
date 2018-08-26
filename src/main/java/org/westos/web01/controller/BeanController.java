package org.westos.web01.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.westos.web01.bean.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用bean作为springmvc的handler处理器
 * Created by Administrator on 2018/8/26.
 */
public class BeanController extends AbstractController {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.addObject("name","你好");
        mv.addObject("stu",student);
        mv.setViewName("hello.jsp");

        return mv;
    }
}
