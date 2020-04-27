package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
	}

	// WILDCARDS CON POINTCUTS
	// @Before("execution(public void QUALIFIED_NAMESPACE.NOMBREPRECISOMETODO())") --> SOLO ESE PRECISO METODO
	// @Before("execution(public void add*())") ==> CUALQUIER METODO QUE COMIENCE POR add+
	// @Before("execution(* * add*())") || @Before("execution(* add*())") PORQUE EL MODIFIER ES OPCIONAL!!!

	// @Pointcut
	// () -> matches a method with no arguments
	// (*) -> matches a method with ONE argument of any type
	// (..) -> zero or more arguments of any type


	// @Pointcut -> utilizamos el mismo pointcut alongside all advices

	/* Como se utiliza?
		// setup pointcut declarations
		@Pointcut("execution(* com.luv2code.springdemo.controller.*.*(..))")
		private void forControllerPackage() {}
	Y despues el nombre del metodo le paso como pointcut!!!
		@Before("forControllerPackage()")
		public void before(JoinPoint theJoinPoint) { ...
 	*/

/*
	// --------------- *** ---------------------

	// setup logger
	private Logger myLogger = Logger.getLogger(getClass().getName());

	// setup pointcut declarations
	@Pointcut("execution(* com.luv2code.springdemo.controller.*.*(..))")
	private void forControllerPackage() {}

	// do the same for service and dao
	@Pointcut("execution(* com.luv2code.springdemo.service.*.*(..))") // return + pckg + class + methodName()
	private void forServicePackage() {}

	@Pointcut("execution(* com.luv2code.springdemo.dao.*.*(..))")
	private void forDaoPackage() {}

	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	private void forAppFlow() {}

	// add @Before advice
	@Before("forAppFlow()")
	public void before(JoinPoint theJoinPoint) {

		// display method we are calling
		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("=====>> in @Before: calling method: " + theMethod);

		// display the arguments to the method

		// get the arguments
		Object[] args = theJoinPoint.getArgs();

		// loop thru and display args
		for (Object tempArg : args) {
			myLogger.info("=====>> argument: " + tempArg);
		}

	}


	// add @AfterReturning advice
	@AfterReturning(
			pointcut="forAppFlow()",
			returning="theResult"
	)
	public void afterReturning(JoinPoint theJoinPoint, Object theResult) {

		// display method we are returning from
		String theMethod = theJoinPoint.getSignature().toShortString();
		myLogger.info("=====>> in @AfterReturning: from method: " + theMethod);

		// display data returned
		myLogger.info("=====>> result: " + theResult);
	}
*/





}










