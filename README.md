# Spring - Aspect Oriented Programming

Spring AOP >> method-level  
AspectJ >> method-level, constructor-level, field-level

Advice
--
```
@Before  
@PointCut  
@Order(n)  
@After  
@AfterReturning(pointcut,returning)  
@AfterThrowing(pointcut,throwing)  
@Around
```

Weaving
--
compile time, load time, runtime(slowest)
