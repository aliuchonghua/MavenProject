package org.westos.web01.factory;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MapperFactoryBean<T> extends AbstractFactoryBean<T> {
    private SqlSessionFactory sqlSessionFactory;
    private Class<T> targetMapClass;

    public void setTargetMapClass(Class<T> targetMapClass) {
        this.targetMapClass = targetMapClass;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public Class<?> getObjectType() {
        return targetMapClass;
    }

    @Override
    protected T createInstance(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        T mapper = sqlSession.getMapper(targetMapClass);
//        使用代理模式
        T result = (T)Proxy.newProxyInstance(mapper.getClass().getClassLoader(),new Class[]{targetMapClass},
                new Mydaili(mapper,sqlSession));
        return result;
    }

    //    代理模式的内部类
    private class Mydaili implements InvocationHandler {
        //被代理的对象
        private Object realobj;
        private SqlSession sqlSession;

        public Mydaili(Object realobj, SqlSession sqlSession) {
            this.realobj = realobj;
            this.sqlSession = sqlSession;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //事务提交的问题
            Object result = method.invoke(realobj, args);
            //关闭sqlsession
            sqlSession.close();
            return result;
        }
    }
}
