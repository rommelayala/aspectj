package com.example.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    // Define un pointcut que captura todas las llamadas al método sayHello
    @Pointcut("execution(* com.example.Hello.sayHello(..))")
    public void sayHelloPointcut() {
        System.out.println("Capturando llamada desde Pointcut");
    }

    // Define un advice que ejecuta después del método sayHello
    @After("sayHelloPointcut()")
    public void afterSayHello() {
        System.out.println("[AspectJ] Método sayHello fue llamado.");
    }
}
