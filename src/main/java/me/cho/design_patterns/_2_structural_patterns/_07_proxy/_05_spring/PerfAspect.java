package me.cho.design_patterns._2_structural_patterns._07_proxy._05_spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerfAspect {

    @Around("bean(gameService)")
    public void timestamp(ProceedingJoinPoint joinPoint) throws Throwable {
        long begin = System. currentTimeMillis();
        joinPoint.proceed();
        System.out.println(System.currentTimeMillis() - begin);
    }
}
