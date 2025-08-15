package com.nk.wipro.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.nk.wipro.services.BloodServiceImpl.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Started: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.nk.wipro.services.BloodServiceImpl.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Finished: " + joinPoint.getSignature().getName());
    }
}
