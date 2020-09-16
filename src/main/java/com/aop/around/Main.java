package com.aop.around;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.logging.Logger;

public class Main {

    private static Logger myLogger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        //read spring config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        TrafficFortuneService trafficFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);

        /*
        String data = trafficFortuneService.getFortune();
        myLogger.info("my fortune: " + data);

         */

        String fortune = null;
        try {
            fortune = trafficFortuneService.getFortune(true);
            myLogger.info("my fortune: " + fortune);
        } catch (Exception e) {
            myLogger.info("getFortune arg is false");
        }


        // close the context
        context.close();
    }
}
