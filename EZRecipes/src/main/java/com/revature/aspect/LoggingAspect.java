package com.revature.aspect;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	private static final Logger LOG = LogManager.getLogger(LoggingAspect.class);
	
	@Pointcut("execution(public * *(..))")
	public void logAll() {
		
	}
	
	@Pointcut("within(com.revature.service.*)")
	public void logWithinServicePackage() {
	}
	
	@Before("logAll()")
	public void logBefore(JoinPoint jp) {
		LOG.info("The " + jp.getSignature().getName() + " method is about to be executed.");
	}
	
	@After("logWithinServicePackage()")
	public void logAfter(JoinPoint jp) {
		LOG.info("The " + jp.getSignature().getName() + " method was just triggered and its access modifier is: " + jp.getSignature().getModifiers());
	}
	
	@AfterReturning(pointcut="logWithinServicePackage()", returning="returnedValue")
	public void logAfterReturning(JoinPoint jp, Object returnedValue) {
		LOG.info("The " + jp.getSignature().getName() + " method was just completed and it returned " + returnedValue);
	}
	
	@AfterThrowing(pointcut="logWithinServicePackage()", throwing="exceptionThrown")
	public void logAfterException(JoinPoint jp, Exception exceptionThrown) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		exceptionThrown.printStackTrace(pw);
		
		LOG.info("The " + jp.getSignature().getName() + " method threw an exception: \n" + sw.toString());
	}
	
	
	
}
