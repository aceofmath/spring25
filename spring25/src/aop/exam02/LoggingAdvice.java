package aop.exam02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class LoggingAdvice {

	//모든 비지니스로직 메소드가 가지는 공통 기능구현
	//Spring으로부터 method, target, 매개변수등의 정보를 가진 joinPoint객체를 전달받는다.
	//즉, 매개변수로 선언만 해 놓기만 하면 가져다 사용만 하면 됨
	public void logging(JoinPoint joinPoint){
		Signature method = joinPoint.getSignature();
		
		String methodName = method.getName();
		System.out.println("methodName : " + methodName);
	}
}
