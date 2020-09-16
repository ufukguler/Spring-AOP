package com.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*
  User: Ufuk
  Date: 16.09.2020 16:08
*/
@Aspect
@Component
@Order(1)
public class LoggingAspect {
/*
    // related advices for logging
    @Before("execution(* add*(com.aop.demo.aop.Account, boolean ))")
    public void beforeAddAccountAdvice() {
        System.out.println("=========> Executing @Before advice on * add*(com.aop.demo.aop.Account)");
    }

    @Before("execution(* tes*())")
    public void afterAddAccountAdvice() {
        System.out.println("=========> Executing @Before advice on * tes*()");
    }

    @Pointcut("execution(* com.aop.demo.dao.*.*(..))")
    public void forDaoPackage() {
    }

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice() {
        System.out.println("=========> Executing @Before advice on beforeAddAccountAdvice");
    }

    @Before("forDaoPackage()")
    public void performApiAnalytics(){
        System.out.println("=========> performApiAnalytics()");
    }
*/
}












