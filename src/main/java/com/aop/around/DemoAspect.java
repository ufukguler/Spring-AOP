package com.aop.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/*
  User: Ufuk
  Date: 16.09.2020 20:11
*/
@Aspect
@Component
public class DemoAspect {

    private static Logger myLogger = Logger.getLogger(DemoAspect.class.getName());

    @Around("execution(* com.aop.around.*.get*(..))")
    public Object aroundGetFortune(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // get method signature
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        myLogger.info("Method: " + signature);

        long begin = System.currentTimeMillis();
        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            myLogger.warning(e.getMessage());
            result = "Something happened :( ";
        }

        long end = System.currentTimeMillis();
        long duration = end - begin;
        myLogger.info("Duration: " + duration / 1000.0);

        return result;
    }

}
