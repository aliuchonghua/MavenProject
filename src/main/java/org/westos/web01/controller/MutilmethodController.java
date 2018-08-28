package org.westos.web01.controller;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.westos.web01.bean.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/8/28.
 */
public class MutilmethodController extends MultiActionController {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public ModelAndView hello(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv=new ModelAndView();
        mv.addObject("name","你好hello");
        mv.addObject("stu",student);
        mv.setViewName("/hello");

        return mv;
    }

    public ModelAndView helloc(HttpServletRequest request, HttpServletResponse response, Student stu){
        ModelAndView mv=new ModelAndView();
        mv.addObject("name","你好helloc");
        mv.addObject("stu",stu);
        mv.setViewName("/hello");

        return mv;
    }
}
