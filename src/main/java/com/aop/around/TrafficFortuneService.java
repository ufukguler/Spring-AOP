package com.aop.around;
/*
  User: Ufuk
  Date: 16.09.2020 21:02
*/

import org.springframework.stereotype.Component;
import java.util.concurrent.TimeUnit;

@Component
public class TrafficFortuneService {
    public static String getFortune() {
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (Exception e){
            System.out.println("error: getFortune");
        }
        return "Expect heavy traffic this morning.";
    }

    public static String getFortune(boolean bool) throws Exception {
        if(bool) {
            throw new Exception("get fortune exception");
        }
        return "Expect heavy traffic this morning.";
    }
}
