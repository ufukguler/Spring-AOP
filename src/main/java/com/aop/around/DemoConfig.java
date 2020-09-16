package com.aop.around;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
  User: Ufuk
  Date: 16.09.2020 16:03
*/

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.aop.around")
public class DemoConfig {

}
