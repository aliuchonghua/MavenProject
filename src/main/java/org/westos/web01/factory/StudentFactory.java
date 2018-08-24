package org.westos.web01.factory;

import org.westos.web01.bean.Student;

public class StudentFactory {
    public static Student create(){
        return new Student();
    }
}
