package com.zhuguang.jack.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AspectXml1 {
    public void before(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName());
        System.out.println("AspectXml1====前置通知");
    }

    public void afterReturning(Object returnVal){
        System.out.println("AspectXml1=====后置通知-->返回值:"+returnVal);
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AspectXml1=====环绕通知前");
        Object object= joinPoint.proceed();
        System.out.println("AspectXml1=====环绕通知后");
        return object;
    }

    public void afterThrowing(Exception e){
        System.out.println("AspectXml1======异常通知:"+ e.getMessage());
    }

    public void after(){
        System.out.println("AspectXml1=====最终通知");
    }
}
