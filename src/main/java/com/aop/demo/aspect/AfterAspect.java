package com.aop.demo.aspect;
/*
  User: Ufuk
  Date: 16.09.2020 20:18
*/

import com.aop.demo.aop.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(3)
public class AfterAspect {

    @AfterThrowing(pointcut = "execution(* com.aop.demo.dao.AccountDAO.findAccountsAfterThrowing(..))",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Throwable ex){
        String method = joinPoint.getSignature().toShortString();
        System.out.println("\n ===== @AfterThrowing on method: " + method);

        System.out.println("\n ===== Exception is: " + ex);

    }


    /*
    @AfterReturning(pointcut = "execution(* com.aop.demo.dao.AccountDAO.findAccounts(..))", returning = "results")
    public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, List<Account> results) {
        String method = joinPoint.getSignature().toShortString();
        System.out.println("\n ===== @AfterReturing on method: " + method);
        System.out.println("\n ===== result is: (before uppercase)" + results);
        converAccountNamesToUpperCase(results);
    }
    static void converAccountNamesToUpperCase(List<Account> accountList){
        for(Account account : accountList)
            account.setName(account.getName().toUpperCase());
    }
    */
}
