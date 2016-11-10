package aop.exam02;

import org.aspectj.lang.ProceedingJoinPoint;

public class TimeCheckAdvice {

	//arroundAdvice�� ���� advice�� ����� �޼ҵ带 advice ���ο��� �����Ų��.
	//���� ��� �޼ҵ带 ������ �� �ִ� ����� ���� ProceedingJoinPoint�� ���� �޾ƾ� �Ѵ�.
	//ProcessdingJoinPoint�� arroundAdvice�� ���� ����� �� ����
	public Object check(ProceedingJoinPoint joinPoint) throws Throwable{
		
		System.out.println("method start.....");
		
		//proceed()�� ȣ������ ������ �����Ͻ� ������ ������ ���� ����
		Object returnValue = joinPoint.proceed();
		
		System.out.println("method end.....");
		
		//��� �޼ҵ��� �������� ����� ��ȯ ���� ��ȯ�ؾ� �Ѵ�.
		return null;
	}
}
