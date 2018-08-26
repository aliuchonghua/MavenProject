package org.westos.web01.SpringAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SpringAdviceB {
    @Before("execution(* org.westos.web01.aop.HelloInterface.say*(..))")
    private void doBefore(JoinPoint point){
        System.out.println("StringAOP注解实现方式:方法执行前");
    }
    @After("execution(* org.westos.web01.aop.HelloInterface.say*(..))")
    private void doAfter(JoinPoint point){
        System.out.println("StringAOP注解实现方式:方法执行后");
    }
    @Around("execution(* org.westos.web01.aop.HelloInterface.say*(..))")
    private Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("StringAOP注解实现方式:执行中");
        Object result = joinPoint.proceed(joinPoint.getArgs());
        return result;
    }
}
