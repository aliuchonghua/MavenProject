package org.westos.web01.factory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;

import java.io.IOException;
import java.io.InputStream;

public class MybatisFactoryBean implements FactoryBean<SqlSessionFactory> {
    private String resource;

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public SqlSessionFactory getObject()  {

        SqlSessionFactory sqlSessionFactory=null;
        try {
            InputStream in= Resources.getResourceAsStream(resource);
            //初始化sqlSession
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sqlSessionFactory;
    }

    @Override
    public Class<?> getObjectType() {
        return SqlSessionFactory.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
