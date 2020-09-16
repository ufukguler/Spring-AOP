package com.aop.demo.dao;

import com.aop.demo.aop.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*
  User: Ufuk
  Date: 16.09.2020 16:02
*/
@Component
public class AccountDAO {
    public void addAccount(Account account, boolean bool) {
        System.out.println(">>> " + getClass().getName() + ":DOING MY DB WORK: ADD AN ACCOUNT");
    }

    public boolean test() {
        System.out.println(">>> " + getClass().getName() + ":Testing..");
        return true;
    }

    public List<Account> findAccountsAfterThrowing(boolean b) throws Exception {
        if(b){
            throw new Exception("bir hata oldu");
        }

        return new ArrayList<Account>();
    }

    public List<Account> findAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("John","Silver"));
        accounts.add(new Account("Tom","Gold"));
        accounts.add(new Account("Jerry","Platinum"));
        return accounts;
    }
}
