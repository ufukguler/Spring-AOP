package com.aop.demo.dao;

import org.springframework.stereotype.Component;

/*
  User: Ufuk
  Date: 16.09.2020 16:27
*/
@Component
public class MembershipDAO {
    public void addAccount() {
        System.out.println(">>> " + getClass().getName() + ":DOING MY DB WORK: ADD A MEMBERSHIP ACCOUNT");
    }

    public void test() {
        System.out.println(">>> " + getClass().getName() + ":Testing..");
    }
}
