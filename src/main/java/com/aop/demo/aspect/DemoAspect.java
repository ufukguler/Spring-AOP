package com.aop.demo.aspect;

import com.aop.demo.aop.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*
  User: Ufuk
  Date: 16.09.2020 18:35
*/
@Aspect
@Component
@Order(2)
public class DemoAspect {
    /*
    @Before("execution(* com.aop.demo.dao.AccountDAO.add*(com.aop.demo.aop.Account, boolean ))")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {
        System.out.println("=====> Executing @Before JoinPoint advice on MembershipDAO.add*");
        // get method signature
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method: " + signature);
        // get method args
        Object[] args = joinPoint.getArgs();
        for (Object o : args) {
            System.out.println(o.toString());
            // get parameters
            if (o instanceof Account) {
                Account account = (Account) o;
                System.out.println("Account Name: "+account.getName());
                System.out.println("Account Level: "+account.getLevel());
            }
        }
    }

     */
}
