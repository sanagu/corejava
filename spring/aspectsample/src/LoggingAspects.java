package com.capgemini.bankapp.aspects;
import  com.capgemini.spring.impl.*;
import com.capgemini.spring.aspect.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.*;
import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;


@Component
@Aspect 
public class LoggingAspects{
	
	@After("execution(* com.capgemini.spring.impl.CalculatorImpl.add(..))")
	public void dd(){
		System.out.println("aspect add is added");
	}
	//@Before("execution(* com.capgemini.spring.impl.CalculatorImpl.divide(..))")
	//public void ivide(){
	//	System.out.println("aspect division is added");
	//}
	@After("execution(* com.capgemini.spring.impl.CalculatorImpl.divide(..))")
	public void divi(ProceedingJoinPoint pjp) throws Throwable{
	Object[] args=pjp.getArgs();
	int firstArg=Integer.parseInt(args[0].toString());
	int secondArg=Integer.parseInt(args[1].toString());
		if(firstArg > 0 && secondArg >0)
		pjp.proceed();
		else
		System.out.println("no zero");
	}
}