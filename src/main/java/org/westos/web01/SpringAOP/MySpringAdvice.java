package org.westos.web01.SpringAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MySpringAdvice {
    private void doBefore(JoinPoint point){
        System.out.println("StringAOP第二种实现方式:方法执行前");
    }
    private void doAfter(JoinPoint point){
        System.out.println("StringAOP第二种实现方式:方法执行后");
    }
    private Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("StringAOP第二种实现方式:执行中");
        Object result = joinPoint.proceed(joinPoint.getArgs());
        return result;
    }
}
