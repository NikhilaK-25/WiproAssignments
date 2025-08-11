package com.nikhila.quizappmonorepo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("within(com.nikhila.quizappmonorepo.controller..*) || within(com.nikhila.quizappmonorepo.services..*)")
    public void appPackagePointcut() {}

    @Before("appPackagePointcut()")
    public void logBefore(JoinPoint jp) {
        logger.info("Entered: {} with args = {}", jp.getSignature(), jp.getArgs());
    }

    @AfterReturning(pointcut = "appPackagePointcut()", returning = "result")
    public void logAfterReturning(JoinPoint jp, Object result) {
        logger.info("Exited: {} with result = {}", jp.getSignature(), result);
    }

    @AfterThrowing(pointcut = "appPackagePointcut()", throwing = "ex")
    public void logAfterThrowing(JoinPoint jp, Throwable ex) {
        logger.error("Exception in: {} - {}", jp.getSignature(), ex.getMessage());
    }
}
