package org.assetnexus.aspect;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class LogAspect {

    @Before("execution(* org.assetnexus.controller.*.*(..))")
    public void logMethodCall(JoinPoint joinPoint){
        log.info("Entering method: " + joinPoint.getSignature().getName());
        log.info("Method arguments: " + JSON.toJSONString(joinPoint.getArgs()));
    }

    @AfterReturning(pointcut = "execution(* org.assetnexus.controller.*.*(..))", returning = "result")
    public void logMethodReturn(JoinPoint joinPoint, Object result){
        log.info("Exiting method: " + joinPoint.getSignature().getName());
        log.info("Method return value: " + JSON.toJSONString(result));
    }
}
