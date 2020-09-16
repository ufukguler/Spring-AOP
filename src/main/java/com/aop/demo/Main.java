package com.aop.demo;

import com.aop.demo.aop.DemoConfig;
import com.aop.demo.dao.AccountDAO;
import com.aop.demo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        //read spring config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        // get bean from spring container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        /*
        // call business method
        accountDAO.addAccount(new Account("Ufuk Güler","Platinum"), true);
        membershipDAO.addAccount();

        accountDAO.test();
        membershipDAO.test();
        */
        /*
        List<Account> accountList = accountDAO.findAccounts();
        System.out.println("\n==== ACCOUNTS ====");
        for(Account account: accountList)
            System.out.println(account.toString());
        */

        try{
            accountDAO.findAccountsAfterThrowing(true);
        }catch (Exception e){
            System.out.println("bir hata");
        }





        // close the context
        context.close();
    }

}
