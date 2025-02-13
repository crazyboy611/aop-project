package com.dtrung.aop_project;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class Logging {
    @Before("execution(* com.dtrung.aop_project.HelloService.sayHello())")
    public void beforeSayHello() {
        log.info("Before say hello");
    }
    @AfterReturning("execution(* com.dtrung.aop_project.HelloService.sayHello())")
    public void afterReturning() {
        log.info("After say hello");
    }
}
