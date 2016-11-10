package aop.exam02;

import org.aspectj.lang.ProceedingJoinPoint;

public class TimeCheckAdvice {

	//arroundAdvice의 경우는 advice가 적용될 메소드를 advice 내부에서 실행시킨다.
	//따라서 대상 메소드를 실행할 수 있는 기능을 가진 ProceedingJoinPoint를 전달 받아야 한다.
	//ProcessdingJoinPoint는 arroundAdvice일 때가 사용할 수 있음
	public Object check(ProceedingJoinPoint joinPoint) throws Throwable{
		
		System.out.println("method start.....");
		
		//proceed()를 호출하지 않으면 비지니스 로직은 실행을 하지 않음
		Object returnValue = joinPoint.proceed();
		
		System.out.println("method end.....");
		
		//대상 메소드의 실행결과로 얻어진 반환 값을 반환해야 한다.
		return null;
	}
}
