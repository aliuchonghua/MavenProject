package org.westos.web01.bean;

/**
 * Created by Administrator on 2018/8/24.
 */
public class Teacher {
    private String name;
    private Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void init(){
        System.out.println("Teacher的初始化,"+this.getName());
    }
}
