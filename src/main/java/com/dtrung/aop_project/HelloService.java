package com.dtrung.aop_project;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public HelloService() {
    }

    public void sayHello() {
        System.out.println("Hello World");
    }
}
