package org.westos.web01.factory;

import org.springframework.beans.factory.FactoryBean;
import org.westos.web01.bean.Student;

public class StudentFactoryBean implements FactoryBean<Student> {

    @Override
    public Student getObject() throws Exception {
        return new Student();
    }

    @Override
    public Class<?> getObjectType() {
        //创建的类
        return Student.class;
    }

    @Override
    public boolean isSingleton() {
        //是否单例
        return false;
    }
}
