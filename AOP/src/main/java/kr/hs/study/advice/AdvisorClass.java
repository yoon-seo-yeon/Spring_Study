package kr.hs.study.advice;

import org.aspectj.lang.ProceedingJoinPoint;

//횡단관심사가 들어갈 곳
public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod 호출1");
		pjp.proceed();	//실제 비지니스 로직 호출(method1())
		System.out.println("aroundMethod 호출2");
	}
	
	public void afterReturning() {
		System.out.println("afterReturning 호출");
	}
	
	public void afterThrowing(Throwable e) {
		System.out.println("afterThrowing 호출");
		System.out.println("e:" + e);
	}
}